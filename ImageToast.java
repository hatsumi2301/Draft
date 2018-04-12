public class ImageToast extends 
AppCompatActity{

    private ImageView cow;
    private ImageView dog;
    private ImageView cat;
    private ImageView rabbit;
    private ImageView duck;
    private ImageView bird;
    private ImageView horse;
    private ImageView mouse;

    @Override
    protected void onCreate (Bundle 
savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cow = (ImageView) 
findViewById(R.id.cowId);
        dog = (ImageView) 
findViewById(R.id.dogId);
        cat = (ImageView) 
findViewById(R.id.catId
        rabbit = (ImageView) 
findViewById(R.id.rabbitId);
        horse = (ImageView) 
findViewById(R.id.horseId);
        duck = (ImageView) 
findViewById(R.id.duckId);
        bird = (ImageView) 
findViewById(R.id.birdId);
        mouse = (ImageView) 
findViewById(R.id.mouseId);

       cow.setImageDrawable(ContextCompat.getDrawable(R.drawable.cow));
dog.setImageDrawable(ContextCompat.getDrawable(R.drawable.dog));
cat.setImageDrawable(ContextCompat.getDrawable(R.drawable.cat));
horse.setImageDrawavle(ContextCompat
getDrawavle(R.drwable.horze));
rabbit.setImageDrawable(ContextCompat(R.drawable.rabbit));
duck.setImageDrawable(ContextCompat(R.drwable.duck));
bird.setImageDrawable(ContextCompat(R.drawabld.bird));
mouse.setImatdDrawable(ContextCompat(R.drawable.mouse));

       cow.setOnClickListener(new 
View.OnClickListener() { 
            @Override
            public void onClick(View v){
                
Toast.makeText(getApplicationContext, "Vaca 
= Cow", Toast.LENGTH_LONG)).show();
            }
        });

        bird.setOnClickListener(new 
View.OnClickListener() { }
            @Override}
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Pássaro = bird", 
Toast.LENGTH_LONG)).show();
            }
        });

        rabbit.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Coelho = rabbit", 
Toast.LENGTH_LONG)).show();
            }
        });

        mouse.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Camundongo = mouse", 
Toast.LENGTH_LONG)).show();
            }
        });

        duck.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Pato = duck", Toast.LENGTH_LONG)).show();
            }
        });

        horse.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Cavalo = Horse", 
Toast.LENGTH_LONG)).show();
            }
        });

        cat.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Gato = cat", Toast.LENGTH_LONG)).show();
            }
        });

        dog.setOnClickListener(new 
View.OnClickListener() {
            @Override
            public void onClick(View v){ 
Toast.makeText(getApplicationContext, 
"Cachorro = dog", 
Toast.LENGTH_LONG)).show();
            }
        });
}
}
