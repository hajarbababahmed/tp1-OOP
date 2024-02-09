package classe_java;

import java.util.Scanner;

public class Etudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        public class Etudiant{
        
        private char nom;
        private char prenom;
        private int matricule;
        public Etudiant(char n, char p, int m) {
        	nom=n;
            prenom=p;
            matricule=m;
   
        }
        
        public void initial (char nom,char prenom,int matricule) {
        	nom= nometudiant;
            prenom= prenometudiant;
            matricule=5345171;
        }
       	
        public void insert (float note) {
        	System.out.println("Note insérée pour l'étudiant " + prenom + " " + nom);
        	
        }
       
        public void supprimer (float note) {
        	System.out.println("Note supprimeé pour l'étudiant " + prenom + " " + nom);
        }
        }
	}

}
