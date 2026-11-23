1-Opération : emprunterLivre. Fault : LivreIndisponibleFault. Action SOAP : http://supnum.mr/bib/emprunterLivre.



2-La signature est à lire dans EmpruntPortType.java, généré par wsimport.



3-dateRetour devient un XMLGregorianCalendar, car le WSDL utilise xs:date. Dans la partie A, le code Java utilise String.



4-La classe d'exception générée est LivreIndisponibleFault, à partir du nom de Fault défini dans le WSDL.





