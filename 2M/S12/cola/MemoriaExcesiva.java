package cola;

public class MemoriaExcesiva extends Exception
{
  MemoriaExcesiva ()
  {
  }
  MemoriaExcesiva (String msj)
  {
    super(msj);
  }
}
