# FleetStudioAssignment

Environment Used:

JDK : 17
IDE : Intellij Idea
Rest Client : Insomnia
DataBase : H2 In Memory DataBase

Steps to Follow:

1) Import the code from the given GitHub link into Intellij Idea.
2) Run the main Application class SpringbootSampleApplication.
3) The application will be running on port 8082 on localhost
4) All the data from provided json file will be stored in the database.
5) You can access all the location details from http://localhost:8082/details/
6) All the records can be seen in database by accessing the http://localhost:8082/h2-console with the credentials (sa/password)
7) You can fetch the records with a particular fips by accessing    http://localhost:8082/details/{fips}

Eg: http://localhost:8082/details/1001 will give the below result

output : 
{
	"fips": 1001,
	"state": "AL",
	"name": "Autauga"
}


8) You can fetch the records with a particular state from http://localhost:8082/details/states/{state}

Eg: http://localhost:8082/details/states/AL

Output: 
[
{"fips": 1001,"state": "AL","name": "Autauga"},
{"fips": 1003,"state": "AL","name": "Baldwin"},
{"fips": 1005,"state": "AL","name": "Barbour"},
{"fips": 1007,"state": "AL","name": "Bibb"},
{"fips": 1009,"state": "AL","name": "Blount"},
{"fips": 1011,"state": "AL","name": "Bullock"},
{"fips": 1013,"state": "AL","name": "Butler"},
{"fips": 1015,"state": "AL","name": "Calhoun"},
{"fips": 1017,"state": "AL","name": "Chambers"},
{"fips": 1019,"state": "AL","name": "Cherokee"},
{"fips": 1021,"state": "AL","name": "Chilton"},
{"fips": 1023,"state": "AL","name": "Choctaw"},
{"fips": 1025,"state": "AL","name": "Clarke"},
{"fips": 1027,"state": "AL","name": "Clay"},
{"fips": 1029,"state": "AL","name": "Cleburne"},
{"fips": 1031,"state": "AL","name": "Coffee"},
{"fips": 1033,"state": "AL","name": "Colbert"},
{"fips": 1035,"state": "AL","name": "Conecuh"},
{"fips": 1037,"state": "AL","name": "Coosa"},
{"fips": 1039,"state": "AL","name": "Covington"},
{"fips": 1041,"state": "AL","name": "Crenshaw"},
{"fips": 1043,"state": "AL","name": "Cullman"},
{"fips": 1045,"state": "AL","name": "Dale"},
{"fips": 1047,"state": "AL","name": "Dallas"},
{"fips": 1049,"state": "AL","name": "DeKalb"},
{"fips": 1051,"state": "AL","name": "Elmore"},
{"fips": 1053,"state": "AL","name": "Escambia"},
{"fips": 1055,"state": "AL","name": "Etowah"},
{"fips": 1057,"state": "AL","name": "Fayette"},
{"fips": 1059,"state": "AL","name": "Franklin"},
{"fips": 1061,"state": "AL","name": "Geneva"},
{"fips": 1063,"state": "AL","name": "Greene"},
{"fips": 1065,"state": "AL","name": "Hale"},
{"fips": 1067,"state": "AL","name": "Henry"},
{"fips": 1069,"state": "AL","name": "Houston"},
{"fips": 1071,"state": "AL","name": "Jackson"},
{"fips": 1073,"state": "AL","name": "Jefferson"},
{"fips": 1075,"state": "AL","name": "Lamar"},
{"fips": 1077,"state": "AL","name": "Lauderdale"},
{"fips": 1079,"state": "AL","name": "Lawrence"},
{"fips": 1081,"state": "AL","name": "Lee"},
{"fips": 1083,"state": "AL","name": "Limestone"},
{"fips": 1085,"state": "AL","name": "Lowndes"},
{"fips": 1087,"state": "AL","name": "Macon"},
{"fips": 1089,"state": "AL","name": "Madison"},
{"fips": 1091,"state": "AL","name": "Marengo"},
{"fips": 1093,"state": "AL","name": "Marion"},
{"fips": 1095,"state": "AL","name": "Marshall"},
{"fips": 1097,"state": "AL","name": "Mobile"},
{"fips": 1099,"state": "AL","name": "Monroe"},
{"fips": 1101,"state": "AL","name": "Montgomery"},
{"fips": 1103,"state": "AL","name": "Morgan"},
{"fips": 1105,"state": "AL","name": "Perry"},
{"fips": 1107,"state": "AL","name": "Pickens"},
{"fips": 1109,"state": "AL","name": "Pike"},
{"fips": 1111,"state": "AL","name": "Randolph"},
{"fips": 1113,"state": "AL","name": "Russell"},
{"fips": 1115,"state": "AL","name": "St Clair"},
{"fips": 1117,"state": "AL","name": "Shelby"},
{"fips": 1119,"state": "AL","name": "Sumter"},
{"fips": 1121,"state": "AL","name": "Talladega"},
{"fips": 1123,"state": "AL","name": "Tallapoosa"},
{"fips": 1125,"state": "AL","name": "Tuscaloosa"},
{"fips": 1127,"state": "AL","name": "Walker"},
{"fips": 1129,"state": "AL","name": "Washington"},
{"fips": 1131,"state": "AL","name": "Wilcox"},
{"fips": 1133,"state": "AL","name": "Winston"}
]

9) You can fetch the records satrting with a particular name by accessing http://localhost:8082/details/state/{name}

Eg : http://localhost:8082/details/state/Ba

Output: 
[
{"fips": 1003,"state": "AL","name": "Baldwin"},
{"fips": 1005,"state": "AL","name": "Barbour"},
{"fips": 5005,"state": "AR","name": "Baxter"},
{"fips": 8009,"state": "CO","name": "Baca"},
{"fips": 12003,"state": "FL","name": "Baker"},
{"fips": 12005,"state": "FL","name": "Bay"},
{"fips": 13005,"state": "GA","name": "Bacon"},
{"fips": 13007,"state": "GA","name": "Baker"},
{"fips": 13009,"state": "GA","name": "Baldwin"},
{"fips": 13011,"state": "GA","name": "Banks"},
{"fips": 13013,"state": "GA","name": "Barrow"},
{"fips": 13015,"state": "GA","name": "Bartow"},
{"fips": 16005,"state": "ID","name": "Bannock"},
{"fips": 18005,"state": "IN","name": "Bartholomew"},
{"fips": 20007,"state": "KS","name": "Barber"},
{"fips": 20009,"state": "KS","name": "Barton"},
{"fips": 21007,"state": "KY","name": "Ballard"},
{"fips": 21009,"state": "KY","name": "Barren"},
{"fips": 21011,"state": "KY","name": "Bath"},
{"fips": 24005,"state": "MD","name": "Baltimore"},
{"fips": 24510,"state": "MD","name": "Baltimore city"},
{"fips": 25001,"state": "MA","name": "Barnstable"},
{"fips": 26013,"state": "MI","name": "Baraga"},
{"fips": 26015,"state": "MI","name": "Barry"},
{"fips": 26017,"state": "MI","name": "Bay"},
{"fips": 29009,"state": "MO","name": "Barry"},
{"fips": 29011,"state": "MO","name": "Barton"},
{"fips": 29013,"state": "MO","name": "Bates"},
{"fips": 31007,"state": "NE","name": "Banner"},
{"fips": 38003,"state": "ND","name": "Barnes"},
{"fips": 41001,"state": "OR","name": "Baker"},
{"fips": 45009,"state": "SC","name": "Bamberg"},
{"fips": 45011,"state": "SC","name": "Barnwell"},
{"fips": 48017,"state": "TX","name": "Bailey"},
{"fips": 48019,"state": "TX","name": "Bandera"},
{"fips": 48021,"state": "TX","name": "Bastrop"},
{"fips": 48023,"state": "TX","name": "Baylor"},
{"fips": 51017,"state": "VA","name": "Bath"},
{"fips": 54001,"state": "WV","name": "Barbour"},
{"fips": 55005,"state": "WI","name": "Barron"},
{"fips": 55007,"state": "WI","name": "Bayfield"},
{"fips": 72017,"state": "PR","name": "Barceloneta Municipio"},
{"fips": 72019,"state": "PR","name": "Barranquitas Municipio"},
{"fips": 72021,"state": "PR","name": "Bayamon Municipio"}
]

NOTE: This can also be tested using  Insomnia/ Postman. 
All the screenshots are attached with this.
