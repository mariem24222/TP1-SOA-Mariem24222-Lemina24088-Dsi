5)
1. Le WSDL publié est-il celui fourni ? Contient-il le motif ISBN et le type xs:date ?

Oui, avec wsdlLocation, Metro utilise le WSDL fourni. Il contient le pattern de l'ISBN et le type xs:date.

2. Avez-vous dû modifier 01-emprunter.xml ? Pourquoi ?

Oui, si nécessaire, pour respecter la structure XML, les noms des éléments et les espaces de noms définis dans le WSDL.

3. Sans @SchemaValidation, l'ISBN 978-2-10 est-il refusé ? Et avec ? Quelle Fault obtenez-vous ?
- Sans @SchemaValidation : pas de validation automatique du schéma.
- Avec @SchemaValidation : l'ISBN est refusé, car il ne respecte pas le pattern.
- Erreur observée : SAXParseException (cvc-pattern-valid).
4. Que change la suppression de wsdlLocation ?

Metro génère automatiquement un nouveau WSDL à partir du code Java et de ses annotations.



Conclusion — Choisir et rendre

1. Deux différences entre les WSDL des parties A et B :
- Partie A : WSDL généré à partir du code Java.
- Partie B : WSDL défini avant le code Java.
- Partie B : contraintes des données définies explicitement dans le contrat.
2. Si on renomme dateRetour dans le code, quel projet voit son contrat changer ?
- Partie A : le WSDL peut changer.
- Partie B : le contrat WSDL reste indépendant du code Java.
- Risque : incompatibilité avec les clients qui utilisent l'ancien contrat.
3. Quelle approche choisir ?
- Service Paiement (.NET, PHP, Node.js) : Contract-first.
- Prototype interne de deux jours : Code-first.