public class ValuesActivityOne extends 
Activity{

    private Button playButton;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) 
findViewById(R.id.playButtonId);

        playButton.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                Intent intent = new 
Intent(ValuesActivityOne.this, 
ValuesActivityTwo.class);
                intent.putExtra("name", 
"batatinha");

                startActivity(intent);
            
}
        });
     }
}
