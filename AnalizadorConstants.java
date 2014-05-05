package analizadorLexico;

/*
 * Se defina las constantes a ser usadas por el analizador lexico
 */

/**
 *
 * @author alejandro
 */
public class AnalizadorConstants {
  public static final char OP_MAS = '+';
  public static final char OP_MENOS = '-';
  public static final char OP_DIV = '/';
  public static final char OP_PUNTOYCOMA = ';';
  public static final char OP_COMA = ',';
  public static final char OP_CONDICION = '?';
  public static final char PARENTESIS_IZQ = '(';
  public static final char PARENTESIS_DER = ')';
  public static final char CORCHETE_IZQ = '[';
  public static final char CORCHETE_DER = ']';
  public static final char OP_MULTIPLICACION= '*';
  public static final char OP_ASIGNACION= '=';
  public static final char OP_REL_MENOR_QUE= '<';
  public static final char OP_REL_MAYOR_QUE= '>';
    public static final char OP_COMILLA= '"';
  public static final String OP_COMPARACION = "==";
  
  
  public static final String PR_IF = "if";
  public static final String PR_TRUE = "true";
  public static final String PR_FALSE = "false";
  public static final String PR_ALERT = "alert";
  public static final String PR_NUM = "num";
  public static final String PR_ID = "id";
  public static final String PR_LITERAL = "literal";
    public static final String PR_COMENTARIO = "comment";
  
}
