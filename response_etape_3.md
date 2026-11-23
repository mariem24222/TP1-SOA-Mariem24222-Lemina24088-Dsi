Réponses aux questions de l'étape 3
1. Pourquoi POST ?

Parce qu'on envoie un message SOAP dans le corps HTTP, même lorsque l'opération consiste à lire une information.

2. Le jeton a-t-il empêché le traitement ?

Non, car le service n'a pas encore déclaré de mécanisme de traitement de ce Header. Sans mustUnderstand, il peut être ignoré.

3. Que se passe-t-il avec SOAP 1.2 ?

Le service est configuré en SOAP 1.1. Il renvoie donc une erreur de version SOAP.

4. Quelles sont les cinq erreurs ?

Ce sont les cinq erreurs du tableau précédent.