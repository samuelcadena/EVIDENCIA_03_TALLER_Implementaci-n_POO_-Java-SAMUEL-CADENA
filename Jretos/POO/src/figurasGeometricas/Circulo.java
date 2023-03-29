package figurasGeometricas;

public class Circulo extends Figura {
        //Atributos
            private float bordes;
            //metodo constructor
        public Circulo(float lado){
            this.bordes=lado;
        }
              
            public float getbordes() {
                return bordes;
            }
        
            public void setborde(float bordes) {
                this.bordes=bordes;
            }
            //meotdo subclase
            public void calcularArea(){
                float area=0;
                area=bordes*bordes;
                System.out.println("El bordes del circulo es "+bordes+"y su area es "+area);
    
                
            }
        
        
        
        }
