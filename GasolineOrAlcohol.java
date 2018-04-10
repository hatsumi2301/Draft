public void GasolineOrAlcohol extends 
AppCompatActivity{
    private Button btnResult;
    private TextView txtResult;
    private EditText edtTxtGasoline;
    private EditText edtTxtAlcohol;

    @Override
    public void onCreate(Budle 
saveInstanceState){
        btnResult = (Button) 
findViewById(R.id.btnResultId);
        txtResult = (TextView) 
findViewById(R.id.txtResult);
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
                        
txtResult.setText("Melhor usar gasolina");
                    }
                    else{
                        
txtResult.setText("melhor usar álcool");
                    }
                }
            }
        }
    }
}
