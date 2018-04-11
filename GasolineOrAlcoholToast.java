public void GasolineOrAlcoholToast extends 
AppCompatActivity{
    private Button btnResult;
    private EditText edtTxtGasoline;
    private EditText edtTxtAlcohol;

    @Override
    protected void onCreate(Budle 
saveInstanceState){
        btnResult = (Button) 
findViewById(R.id.btnResultId);
        edtTxtGasoline = (EditText) 
findViewById(R.id.edtTxtGasolineId);
        edtTxtAlcohol = (EditText) 
findViewById(R.id.edtTxtAlcoholId);

        btnResult.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){
                string gasoline = 
edtTxtGasoline.getText().toString();
                string alcohol = 
edtTxtAlcohol.getText().toString();

                if((!gasoline.isEmpty()) && 
(!alcohol.isEmpty()){
                    double gasolineDouble = 
Double.parseDouble(gasoline);
                    double alcoholDouble = 
Double.parseDouble(alcohol);

                    double result = 
alcoholDouble / gasolinDouble;

                    if(result > 0.7){
                        
Toast.makeText(getApplicationContext(), 
"Melhor usar gasolina", 
Toast.LENGTH_LONG).show();                    
}
                    else{
                        
Toast.makeText(getApplicationContext(), 
"Melhor usar alcool", 
Toast.LENGTH_LONG).show();
                    }
                }
            }
        }
    }
}
