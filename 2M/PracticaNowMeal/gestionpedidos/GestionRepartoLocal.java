package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Furgoneta;
import gestionpedidos.transportes.Moto;
import gestionpedidos.transportes.Transporte;
import list.ArrayList;
import anotacion.Programacion2;

@Programacion2 (
 nombreAutor1 = "Rubén",
 apellidoAutor1 = "Aguado Cosano",
 emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class GestionRepartoLocal {
 // C�DIGO DE APOYO
 private ArrayList<Moto> motosDisponibles;
 private ArrayList<Furgoneta> furgonetasDisponibles;

 private ArrayList<Pedido> pedidosEsperandoMoto;
 private ArrayList<Pedido> pedidosEsperandoFurgoneta;

 // C�DIGO DE APOYO
 private static ArrayList<String> getCodList(ArrayList<?> disponibles) {
  ArrayList<String> salida = new ArrayList<>();
  for(int i=0; i<disponibles.size(); i++)
   salida.add(salida.size(),((Transporte) disponibles.get(i)).getCodigo());
  return salida;
 }

 // C�DIGO DE APOYO
 private static ArrayList<String[]> getClienteRestauranteList(ArrayList<?> disponibles){
   ArrayList<String[]> salida = new  ArrayList<>();
  for(int i=0; i<disponibles.size(); i++)
   salida.add(salida.size(),new String[]{((Pedido) disponibles.get(i)).getCliente().getCodigo() ,
     ((Pedido) disponibles.get(i)).getRestaurante().getCodigo()});
  return salida;
 }

 // C�DIGO DE APOYO
 private static String myArrayListToString (ArrayList<?> list){
  String salida = "";
  for(int i=0; i<list.size(); i++){
   salida += " " ;
   if (list.get(i) instanceof String[]){
    String[] item = (String[])list.get(i);
    for(int j=0; j<item.length; j++){
     salida += item[j] ;
    }
   }else if (list.get(i) instanceof String){
    salida += (String)list.get(i);
   }
  }

  return salida;
 }

 // C�DIGO DE APOYO
 public String getDisponibles(){
  return "Motos Disponibles:" + myArrayListToString(getCodList(motosDisponibles)) + System.lineSeparator() +
   "Furgonetas Disponibles:" + myArrayListToString(getCodList(furgonetasDisponibles)) + System.lineSeparator();

 }

 // C�DIGO DE APOYO
 public String getEsperando(){
  return "Pedidos esperando moto:" + myArrayListToString(getClienteRestauranteList(pedidosEsperandoMoto)) + System.lineSeparator() +
    "Pedidos esperando furgoneta:" + myArrayListToString(getClienteRestauranteList(pedidosEsperandoFurgoneta)) + System.lineSeparator();
 }

 // C�DIGO DE APOYO
 public ArrayList<String> getCodMotosDisponibles(){
  return getCodList(motosDisponibles);
 }

 // C�DIGO DE APOYO
 public ArrayList<String> getCodFurgoDisponibles(){
  return getCodList(furgonetasDisponibles);

 }

 // C�DIGO DE APOYO
 public ArrayList<String[]> getCodEsperandoMoto(){
  return getClienteRestauranteList(pedidosEsperandoMoto);
 }

 public ArrayList<String[]> getCodEsperandoFurgo(){
  return getClienteRestauranteList(pedidosEsperandoFurgoneta);
 }

 private static final double PESOMAXMOTO = 20;

 // C�DIGO DE APOYO
 public GestionRepartoLocal(){

  this.motosDisponibles = new ArrayList<>();
  this.furgonetasDisponibles = new ArrayList<>();

  this.pedidosEsperandoFurgoneta = new ArrayList<>();
  this.pedidosEsperandoMoto = new ArrayList<>();
 }

 public void add(Transporte transporte){
  if(transporte instanceof Moto){
   motosDisponibles.add(motosDisponibles.size(), (Moto)transporte);
  } else {
   furgonetasDisponibles.add(furgonetasDisponibles.size(), (Furgoneta)transporte);
  }
 }

 // Para evitar repetir código en asignarPedido se crea una función auxiliar valida para motos y furgonetas
 private <T extends Transporte> void subAsignar(Pedido pedido, ArrayList<T> transporteDisponible, ArrayList<Pedido> waiting) {
   if(transporteDisponible.size() != 0) {
     int idOptimo = 0;
     double thisCoste, costeOptimo = Double.MAX_VALUE;
     for (int i = 0; i < transporteDisponible.size(); i++) {
       thisCoste = pedido.coste(transporteDisponible.get(i));
       if (thisCoste < costeOptimo) {
         idOptimo = i;
         costeOptimo = thisCoste;
       }
     }
     pedido.setTransporte(transporteDisponible.get(idOptimo));
     transporteDisponible.removeElementAt(idOptimo);
   } else {
     waiting.add(waiting.size(), pedido);
   }
 }

 public void asignarPedido(Pedido pedido){
  if (pedido.getPeso() <= PESOMAXMOTO) {
    subAsignar(pedido, motosDisponibles, pedidosEsperandoMoto);
  } else {
    subAsignar(pedido, furgonetasDisponibles, pedidosEsperandoFurgoneta);
  }
 }

// Para evitar repetir código en notificarEntregaPedido se crea una función auxiliar valida para motos y furgonetas
 @SuppressWarnings("unchecked")
 private <T extends Transporte> void subNotificar(Transporte transporte, ArrayList<T> transporteDisponible, ArrayList<Pedido> waiting) {
   if (waiting.size() != 0) {
    waiting.get(0).setTransporte(transporte);
    waiting.removeElementAt(0);
   } else {
    transporteDisponible.add(transporteDisponible.size(), (T)transporte);
   }
 }

 public void notificarEntregaPedido(Pedido pedido) {
  Transporte transporte = pedido.getTransporte();
  if (transporte instanceof Moto){
   subNotificar(transporte, motosDisponibles, pedidosEsperandoMoto);
  } else {
   subNotificar(transporte, furgonetasDisponibles, pedidosEsperandoFurgoneta);
  }
 }
}
