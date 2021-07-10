
/* 

    Fill with appropriate and required javascript global variables  code here 

*/


function EstimateReducingInterestLoan()
{
	/* Fill with required javascript code to read input values from HTML Components  */
	var principal=Number(document.getElementById("principalAmount").value);
var interestRate=Number(document.getElementById("interestRate").value);
var tenure=Number(document.getElementById("tenure").value);


	  calculateEMI(principal,interestRate,tenure);
      totalPayment(principal,interestRate,tenure);
     totalInterest(principal,interestRate,tenure);
      EstimateFixedInterestLoan(principal,interestRate,tenure);


    
}

function EstimateFixedInterestLoan(principal,interestRate,tenure){

    /* Fill with required javascript code here  */
    tenure=tenure/12;
    document.getElementById("tInterestFixed").innerHTML =((principal*interestRate*tenure)/100).toFixed(2); /*Assign total Interest value here*/
    // alert(principal);
     /* Fill with required javascript code here  */
    document.getElementById("tPaymentFixed").innerHTML = (((principal*interestRate*tenure)/100)+principal).toFixed(2); /*Assign total payment value here*/
    
     /* Fill with required javascript code here  */
     var fixedTotalPayment=((principal*interestRate*tenure)/100)+principal;
    document.getElementById("EMIFixed").innerHTML = (fixedTotalPayment/(tenure*12)).toFixed(2); /*Assign emi  value here*/
    
    
}

function calculateEMI(principal,interestRate,tenure){
	
    /* Fill with required javascript code here  */
     interestRate=(interestRate/100) / 12;
    
    document.getElementById("EMI").innerHTML = (principal*interestRate*(Math.pow(1+interestRate, tenure) / (Math.pow(1+interestRate, tenure)-1))).toFixed(2);
}

function totalPayment(principal,interestRate,tenure){
	interestRate=(interestRate/100) / 12;
	/* Fill with required javascript code here  */
var emi=principal*interestRate*(Math.pow(1+interestRate, tenure) / (Math.pow(1+interestRate, tenure)-1));
	
    document.getElementById("tPayment").innerHTML =(emi*tenure).toFixed(2); /*Assign total payment value here*/
}

function totalInterest(principal,interestRate,tenure){
    interestRate=(interestRate/100) / 12;
	var emi=principal*interestRate*(Math.pow(1+interestRate, tenure) / (Math.pow(1+interestRate, tenure)-1));
/* Fill with required javascript code here  */
var totalPayment =emi*tenure;
    document.getElementById("tInterest").innerHTML = (totalPayment-principal).toFixed(2); /*Assign total Interest value here*/
}


