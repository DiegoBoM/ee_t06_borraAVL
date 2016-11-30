/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t06_borraavl;

/**
 *
 * @author Diego Bolaños Miguel
 */
public class Ee_t06_borraAVL {

    public void eliminar(T dato){
        if(buscar(dato) != null){
            if (raiz.getdato()== dato && raiz.getder()== null&& raiz.getizq()==null){
                raiz=null;
            }

            else{

            
            
                NodoA  aux=raiz;
                NodoA anterior=null;

                int x=0;
                while(aux!= null){
                    if (aux.getdato()==dato){
                        break;
                    }
                    else
                        x=aux.getdato().compareTo(dato);
                    if(x>0){
                        anterior=aux;
                        aux=aux.getizq();
                    }
                    else
                    if(x<0){
                        anterior=aux;
                        aux=aux.getder();
                    }
                }   

                if(aux.getizq()==null&& aux.getder()==null){
                    if(anterior.getizq().getdato()==dato){
                        anterior.setizq(null);
                    }
                    else
                        anterior.setder(null);

                }
                else{
                    NodoA cambio=aux.getder();
                    NodoA antece=null;        

                    if (cambio!= null){

                        if(cambio.getizq()!= null){
                            while(cambio.getizq()!= null){
                                antece=cambio;
                                cambio=cambio.getizq();
                            }   

                            aux.setdato(cambio.getdato());
                            antece.setizq(null);
                        }
                        else
                        if (cambio.getizq()==null){
                            aux.setdato(cambio.getdato());
                            aux.setder(null);

                        }

                    }

                }
            }
        }
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
