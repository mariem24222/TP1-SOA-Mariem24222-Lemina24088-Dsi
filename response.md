Étape 1 : Questions et réponses
1. Quelle annotation fait de EmpruntService un service Web ? Quelle annotation fait de LivreIndisponibleException une erreur déclarée dans le contrat ?
- @WebService : déclare un service Web.
- @WebFault : déclare une erreur dans le contrat SOAP.
2. Pourquoi les classes de données doivent-elles avoir un constructeur vide ?

Pour permettre à JAX-WS de créer automatiquement les objets lors de la conversion XML/Java.
Étape 2 : Lire le WSDL généré
1. Quelle est l'URL du service ? Quelles sont les deux opérations et leurs messages d'entrée et de sortie ?

URL : http://localhost:8080/bib/EmpruntService
- emprunterLivre : entrée emprunterLivre, sortie emprunterLivreResponse.
- rendreLivre : entrée rendreLivre, sortie rendreLivreResponse.
2. Quel style et quel use le binding déclare-t-il ? Est-ce du SOAP 1.1 ou 1.2 ?
- Style : document.
- Use : literal.
- Version : SOAP 1.1.
3. Quel type XSD a été généré pour isbn et dateRetour ? La règle de format de l'ISBN apparaît-elle ?

Le WSDL renvoie vers un XSD externe (?xsd=1). Les types exacts et la règle de format doivent être vérifiés dans ce XSD.

4. Dans la requête SoapUI, les paramètres idAdherent et isbn portent-ils un préfixe d'espace de noms ?

À vérifier dans la requête générée par SoapUI.

5. Dans l'onglet Raw, où voyez-vous HTTP, XML, SOAP ? Quel rôle joue chacun de ces standards, et quel rôle joue le WSDL ?
- HTTP : transporte les messages.
- XML : structure les données.
- SOAP : définit le format des messages.
- WSDL : décrit le contrat et les opérations du service.