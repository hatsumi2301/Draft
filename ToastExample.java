public class ToastExample extends 
AppCompatActivity{
    private Button btnButton;

    @Override
    protected void onCreate(Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        
setContentView(R.layout.main_activity);

        btnButton = (Button) 
findViewById(R.id.btnButtonId);

        btnButton.setOnClickListener(new 
OnClickListener(){
            @Override
            public void onClick(View v){
                
Toast.makeText(getApplicationContext(), 
"Mensagem ao clicar no botão", 
Toast.LENGTH_LONG).show();
            }
        }
    }
}
