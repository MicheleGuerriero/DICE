# DICE
1- DiceModelingProject:
	this project contains all the meta-models that we have. Also, the results of ATL transformations will be
	saved into its related folder in this project.
2- DTSM2DDSM:
	this project contains all the ATL transformations that is needed( the name of the atl files makes their duty
	clear to user.
3- org.polimi.mymodelingproject:
  this is a modeling project that is used only once to generate the grammar project(org.xtext.example.json) from the genmodel of TOSCA diagram.
4- org.xtext.example.json:
	this project is completely new, it takes an xmi-TOSCA model and runs the grammar against it. then it uses 
	a python file to convert the json into its YAML representation.
	
