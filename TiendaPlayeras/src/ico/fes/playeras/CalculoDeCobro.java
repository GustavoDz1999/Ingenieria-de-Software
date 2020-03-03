/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.playeras;

/**
 *
 * @author gusdi
 */
public class CalculoDeCobro {
    private int numDePlayeras;
    private int tipoDePlayera;
    public static final int CamisaMangaCorta=1;
    public static final int CamisaCasualMangaLarga=2;
    public static final int CamisaForfmalMangaLarga=3;
    

    public CalculoDeCobro() {
    }

    public CalculoDeCobro(int numDePlayeras, int tipoDePlayera) {
        this.numDePlayeras = numDePlayeras;
        this.tipoDePlayera = tipoDePlayera;
    }

    public int getNumDePlayeras() {
        return numDePlayeras;
    }

    public void setNumDePlayeras(int numDePlayeras) {
        this.numDePlayeras = numDePlayeras;
    }

    public int getTipoDePlayera() {
        return tipoDePlayera;
    }

    public void setTipoDePlayera(int tipoDePlayera) {
        this.tipoDePlayera = tipoDePlayera;
    }
    
    
    public double porcentaje(){
        double total;
        float porcentaje=0;
        switch (this.tipoDePlayera){
            case 1:
                if (this.numDePlayeras==1||this.numDePlayeras==2){
                    porcentaje=(float) 0;
                }else if(this.numDePlayeras>=3&&this.numDePlayeras<=5){
                    porcentaje=(float) 0.05;
                }else if(this.numDePlayeras>5){
                    porcentaje=(float) 0.08;
                }else{
                    System.out.println("No has comprado ninguna camisa");
                }
                total=(this.numDePlayeras*190)-(porcentaje*190);
                break;
            case 2:
                if (this.numDePlayeras==1||this.numDePlayeras==2){
                    porcentaje=0;
                }else if(this.numDePlayeras>=3&&this.numDePlayeras<=5){
                    porcentaje=(float) 0.05;
                }else if(this.numDePlayeras>5){
                    porcentaje=(float) 0.08;
                }else{
                    System.out.println("No has comprado ninguna camisa");
                }
                total=(230*this.numDePlayeras)-(porcentaje*230);
                break;
            case 3:
                if (this.numDePlayeras==1||this.numDePlayeras==2){
                    porcentaje=0;
                }else if(this.numDePlayeras>=3&&this.numDePlayeras<=5){
                    porcentaje=(float) 0.05;
                }else if(this.numDePlayeras>5){
                    porcentaje=(float) 0.08;
                }else{
                    System.out.println("No has comprado ninguna camisa");
                }
                total=(310*this.numDePlayeras)-(porcentaje*310);
                break;
            default:
                throw new AssertionError();
        }
        return total;
    }
}