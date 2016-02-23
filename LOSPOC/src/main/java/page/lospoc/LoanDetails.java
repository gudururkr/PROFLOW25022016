package page.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class LoanDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "LOANDETAILS_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "LOANDETAILS_ID_GENERATOR", sequenceName = "LOANDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Tenor Months")
   private java.lang.Integer loanTenorMonths;

   private java.lang.Long processInstanceID;

   private Integer downPaymentAmount;

   private Integer amountRequired;

   private Double interestRate;

   private java.lang.String interestRatetype;

   @org.kie.api.definition.type.Label("Minimum Acceptable Loan")
   private Integer minAcceptableLoan;

   private Integer projectCost;

   private Integer emi;

   private Integer loanAmount;

   private Integer totalInterest;

   private Integer totalRepayment;

   public LoanDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getLoanTenorMonths()
   {
      return this.loanTenorMonths;
   }

   public void setLoanTenorMonths(java.lang.Integer loanTenorMonths)
   {
      this.loanTenorMonths = loanTenorMonths;
   }

   public java.lang.Long getProcessInstanceID()
   {
      return this.processInstanceID;
   }

   public void setProcessInstanceID(java.lang.Long processInstanceID)
   {
      this.processInstanceID = processInstanceID;
   }

   public java.lang.String getInterestRatetype()
   {
      return this.interestRatetype;
   }

   public void setInterestRatetype(java.lang.String interestRatetype)
   {
      this.interestRatetype = interestRatetype;
   }

   public java.lang.Integer getDownPaymentAmount()
   {
      return this.downPaymentAmount;
   }

   public void setDownPaymentAmount(java.lang.Integer downPaymentAmount)
   {
      this.downPaymentAmount = downPaymentAmount;
   }

   public java.lang.Integer getAmountRequired()
   {
      return this.amountRequired;
   }

   public void setAmountRequired(java.lang.Integer amountRequired)
   {
      this.amountRequired = amountRequired;
   }

   public java.lang.Integer getMinAcceptableLoan()
   {
      return this.minAcceptableLoan;
   }

   public void setMinAcceptableLoan(java.lang.Integer minAcceptableLoan)
   {
      this.minAcceptableLoan = minAcceptableLoan;
   }

   public java.lang.Integer getProjectCost()
   {
      return this.projectCost;
   }

   public void setProjectCost(java.lang.Integer projectCost)
   {
      this.projectCost = projectCost;
   }

   public java.lang.Integer getEmi()
   {
      return this.emi;
   }

   public void setEmi(java.lang.Integer emi)
   {
      this.emi = emi;
   }

   public java.lang.Integer getLoanAmount()
   {
      return this.loanAmount;
   }

   public void setLoanAmount(java.lang.Integer loanAmount)
   {
      this.loanAmount = loanAmount;
   }

   public java.lang.Integer getTotalInterest()
   {
      return this.totalInterest;
   }

   public void setTotalInterest(java.lang.Integer totalInterest)
   {
      this.totalInterest = totalInterest;
   }

   public java.lang.Integer getTotalRepayment()
   {
      return this.totalRepayment;
   }

   public void setTotalRepayment(java.lang.Integer totalRepayment)
   {
      this.totalRepayment = totalRepayment;
   }

   public java.lang.Double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(java.lang.Double interestRate)
   {
      this.interestRate = interestRate;
   }

   public LoanDetails(java.lang.Long id, java.lang.Integer loanTenorMonths,
         java.lang.Long processInstanceID, java.lang.Integer downPaymentAmount,
         java.lang.Integer amountRequired, java.lang.Double interestRate,
         java.lang.String interestRatetype, java.lang.Integer minAcceptableLoan,
         java.lang.Integer projectCost, java.lang.Integer emi,
         java.lang.Integer loanAmount, java.lang.Integer totalInterest,
         java.lang.Integer totalRepayment)
   {
      this.id = id;
      this.loanTenorMonths = loanTenorMonths;
      this.processInstanceID = processInstanceID;
      this.downPaymentAmount = downPaymentAmount;
      this.amountRequired = amountRequired;
      this.interestRate = interestRate;
      this.interestRatetype = interestRatetype;
      this.minAcceptableLoan = minAcceptableLoan;
      this.projectCost = projectCost;
      this.emi = emi;
      this.loanAmount = loanAmount;
      this.totalInterest = totalInterest;
      this.totalRepayment = totalRepayment;
   }

}