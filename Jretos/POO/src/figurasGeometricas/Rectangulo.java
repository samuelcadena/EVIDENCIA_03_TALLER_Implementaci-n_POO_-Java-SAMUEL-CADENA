package figurasGeometricas;

public class Rectangulo extends Figura {
//Atributos
    private float lado;
    //metodo constructor
public Rectangulo(float lado){
    this.lado=lado;
}
      
    public float getlado() {
        return lado;
    }

    public void setlado(float lado) {
        this.lado=lado;
    }
    //meotdo subclase
    public void calcularArea(){
        float area=0;
        area=lado*lado;
        System.out.println("El lado del rectangulo es "+lado+"y su area es "+area);

        
    }



}
    

