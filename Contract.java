
public class Contract {
private int id;
private String history;
private String companyName;
private Clause[]arrclauses;
private int nbc;

public Contract(int id , String date,String companyName){
	id=id;
	date=date;
	companyName=companyName;
	arrclauses=new Clause[20];
	nbc=0;
}
public double calculateContractRevenue(){
	double rev=0.0;
	for(int i=0;i<=nbc;nbc++){
		rev+=arrclauses[i].getrevaneu();
}
	return rev;
}
public Boolean addClause(Clause c){
	if (nbc<arrclauses.length){
		arrclauses[nbc]=new Clause(c);
	nbc++;
	return true;
}
else
	return false;
}
public Clause[] getClause(double r){
	Clause [] res= new Clause[nbc];
	int j =0;
	for(int i=0;i<=nbc;i++){
		if(arrclauses[i].getrevaneu() < j){
			
		
			res[j]=arrclauses[i];
		j++;
		
	}
		}
	 return res;

}
public Clause getleesrev(){
	Clause lessrev =arrclauses[0];
	for(int i=1; i<nbc;i++){
		if(arrclauses[i].getrevaneu() < lessrev.getrevaneu())
			lessrev=arrclauses[i];
			
		}
		return lessrev;
	}
	
}


