package errores;

class CalcTiempoDescarga {
        // Calcular Tiempo
        public static double calculaTiempo(double velocidadMbps, double tamanoMB){
                // convertir Mbps a MBps
                double velocidadMBps = velocidadMbps/8;     /* 1 Byte = 8 bits */
                return tamanoMB / velocidadMBps;
        }
        
        // Método principal
        public static void main(String[] args){
            // arreglos declarados e inicializados
        	try{
            double[] tamanosMB = {1024d, 2048d, 4096d};
            double[] velocidadesMbps = {2.1d, 0.9d, new Double(null)};
            
                for (double tamanoMB: tamanosMB){
                        for (double velocidadMbps: velocidadesMbps){
                                double tiempo = CalcTiempoDescarga.calculaTiempo(velocidadMbps, tamanoMB);
                                System.out.println(String.format("Tu descarga de %sMB a %sMbps "
                                                + "estará lista en %.2f segundos", tamanoMB, velocidadMbps, tiempo ));
                        }
                }
             } catch (NullPointerException ex){
            	 System.out.println(String.format("Ocurrió un error: %s (%s)", ex.toString(), ex.getCause()));
             } 
        	System.out.println("Fin del programa.");
        }
}