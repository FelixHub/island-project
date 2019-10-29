# Small research project on emulating personnality in argumentation process between conversationnal agent

J’ai passé un jour par semaine depuis février au LIMSI  (Laboratoire d’Informatique pour la Mécanique et les Sciences de l’Ingénieur). Encadré par Nicolas Sabouret et Lydia Ould Ouali du groupe CPU (Cognition, Perception, Usages). Ce groupe de recherche développe des travaux en intelligence artificielle sur la simulation du comportement humain. 

L’un des objectifs de l’équipe est de concevoir des agents virtuels animés capables d’interagir avec des humains de manière naturelle, de raisonner sur les émotions et la personnalité, de reproduire des comportements humains.  Au début de l’année nous avions prévu de me faire travailler dans le prolongement de la thèse de Lydia sur la relation de dominance dans les processus de négociation collaborative [1], qu’elle expérimentait dans le contexte suivant : deux agents doivent se mettre d’accord sur l’endroit où ils vont aller manger le soir. Mon objectif cette année a été de modéliser l’influence de la personnalité dans le processus d’argumentation entre agents. Je voulais aussi me familiariser avec les modèles informatiques et les théories issues des sciences humaines et sociales utilisés par les chercheurs du CPU.  

Les chatbots, ou agents conversationnels, se sont démocratisés ces dernières années. Que ce soit Alexa (Amazon), Siri (Apple) ou Cortana (Windows), nous sommes de plus en plus en dialogue avec nos appareils numériques. C’est le « nouveau visage de la relation client ». Le postulat qui motive les recherches dans ce domaine est que plus l’agent conversationnel est socialement adapté, c’est-à-dire se comporte comme un humain, plus les interactions avec lui sont naturelles et efficace. Le réalisme de ces programmes jouera surement un futur grand rôle dans les domaines comme la santé ou l’éducation. C’est le paradigme CASA (computers as social actors) : les humains applique la même heuristique sociale au ordinateur car ils ont des attributs sociaux similaires ( mots en sortie, interactitivité, occupation de rôle traditionnel). 
 
Je travaillai le mercredi dans la salle des stagiaires du LIMSI. J’ai appris à me servir de GitHub pour pouvoir partager avec mes encadrants l’avancé de mes travaux. Un point de méthodologie très important qu’ils m’ont appris est de toujours prendre des notes. Nicolas voulait impérativement un compte rendu de chaque jour passé au LIMSI, je résumais mes lectures d’articles dans un document « état de l’art » et je réalisais des notes d’intention sur mes objectifs. Cela m’a beaucoup aidé. Je travaillais le plus souvent sur mon ordinateur, que ce soit pour lire des articles, coder mon programme ou écrire. 

Mon travail a tout d’abord été de me documenter sur le sujet. J’ai également dû apprendre à coder en Java, car Nicolas m’avait conseillé ce langage pour la phase de modélisation à venir, et les bases des outils statistiques appliqués à la psychologie [2]. J’ai assez vite commencé à me pencher sur les théories de la personnalité : PERSEED[3] , le modèle FFM [4] (openness to experience, conscientiousness, extraversion, agreeableness and neuroticis), CAPS [5]… Ces modèles sont compliqués. Une théorie assez simple sur laquelle j’ai continué à travailler est la théorie du regulatory focus de Higgins[6] . Selon celle-ci, les personnes ont différentes façons de poursuivre leurs objectifs. Toute personne cherche le plaisir et évite la douleur, mais il y a deux façons de le faire. Dans un processus de prise de décisions, on peut percevoir la situation en termes de gains possible (personnalité promotion focus) ou en termes d’atteinte à sa sécurité (personnalité prevention focus). Nous nous sommes alors mis d’accord sur un plan d’attaque. 

### Création d’un modèle en trois étapes : 
- Programmer un agent conversationnel capable d’argumenter en fonction d’un type de focus choisi.  
- Le doter d’un type de focus, qui conditionnerai au moins ses réponses dans le dialogue argumentatif. 
- Le rendre capable d’identifier le focus de son interlocuteur, et d’y adapter sa stratégie argumentative pour être le plus convaincant/persuasif possible. 
 
### Expérimenter pour tester les hypothèses : 
- L’argumentation a elle l’air naturelle ?  
- Un usager peut-il identifier le focus d’un l’agent artificiel ? 
- L’adaptation de la stratégie argumentative de l’agent au type de focus de l’usager augmente t’il les chances de « « victoire argumentative » » de l’agent ? 


 
Au bout du compte, je n’ai pas eu le temps de finir la première étape de la création du modèle. 
Comme contexte exploitable, nous avons choisi la situation de l’île déserte, un classique des jeux d’entreprises [7]. Deux agents conversationnels ont un certain nombre d’objets à disposition, et un sac d’une certaine contenance. Ils doivent se mettre d’accord sur les objets à mettre dans le sac, en sachant que ce sera leur seul bagage lors d’une expédition sur une ile déserte tropicale.  Je devais faire des recherches pour formaliser le modèle, dans des domaines variés : comment simuler le tour de parole dans une conversation ? Quels types de messages mes agents doivent ils émettre ? Comment faire pour que leur personnalité s’exprime par leur choix d’objet/ façon d’argumenter ?


### Bibliographie : 
 
[1] Ouali L.O., Sabouret N., Rich C. (2017) A Computational Model of Power in Collaborative Negotiation Dialogues. 

[3] Faur C., Pesty S. Martin J.C., PERSEED: a Self-based Model of Personality for Virtual Agents Inspired by Socio-cognitive Theories 

[4] R.Santos, G.Marreiros… Personality, Emotion and Mood Simulation in Descision Making. 

[5] Shoda Y., A cognitive-affective system theory of personality: reconceptualizing situations, dispositions, dynamics, and invariance in personality structure. 

[6] E.T.Higgins, Promotion and Prevention : Regulatory Focus as a Motivational Principle. 
