package cl.devops.ejemplotdd.service;

public class ConversorRomano {

    public static Object intToRoman(int num) {

        String retorno = "";
        String sunidad = getNumeroRomano("I", "V", "X", getDigito(num, 1));

        retorno = sunidad;

        if (num >= 10) {
            String sdecena = getNumeroRomano("X", "L", "C", getDigito(num, 2));
            retorno = sdecena + retorno;
        }
        if (num >= 100) {
            String scentena = getNumeroRomano("C", "D", "M", getDigito(num, 3));
            retorno = scentena + retorno;
        }
        return retorno;
    }

    private static int getDigito(int num, int pos) {
        String snum = num + "";
        return Integer.parseInt("" + snum.charAt(snum.length() - pos));
    }

    private static int getLargo(int num) {
        return ("" + num).length();
    }

    private static String getNumeroRomano(String unidad, String cinco, String decena, int num) {
        String retorno = "";
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
                retorno = componeNumero(unidad, num);
                break;
            case 4:
                retorno = unidad + cinco;
                break;
            case 5:
                retorno = cinco;
                break;
            case 6:
            case 7:
            case 8:
                retorno = cinco + componeNumero(unidad, num - 5);
                break;
            case 9:
                retorno = unidad + decena;
                break;

        }
        return retorno;
    }

    public static String componeNumero(String simbolo, int cant) {
        String resultado = "";
        for (int i = 0; i < cant; i++) {
            resultado += simbolo;
        }
        return resultado;
    }

}
