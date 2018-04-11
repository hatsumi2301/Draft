public void GasolineOrAlcohol extends 
AppCompatActivity{
    private Button btnResult;
    private EditText edtTxtEnterMessage;

    @Override
    public void onCreate(Budle 
saveInstanceState){
        btnResult = (Button) 
findViewById(R.id.btnResultId);
        edtTxtEnterMessage = (EditText) 
findViewById(edtTxtEnterMessageId);

        btnResult.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){
                string message = 
edtTxtEnterMessage.getText().toString();

                
if((!edtTxtEnterMessage.isEmpty()){
                    
Toast.makeText(getApplicationContext(), 
"Mensagem digitada:" + edtTxtEnterMessage, 
Toast.LENGTH_LONG).show();
            }
        }
    }
}
