//Ghani Baskara Syah
//245150700111008

public class Perpustakaan {
    public static void main(String[] args) {
        //LANJUTAN DARI TUGAS KEDUA

        //Ujicoba method copy, jumlah kata, dan kesamaan
        //Inisialisasi objek bukuBaru tanpa constructor (belum memiliki atribut)
        Buku bukuBaru = new Buku();
        Penulis scott = new Penulis("F. Scott Fitzgerald");

        //Inisialisasi objek bukuLama dengan constructor yang telah diisi
        Buku bukuLama = new Buku( "The Great Gatsby","Berlatar di era Roaring Twenties di Amerika Serikat, novel ini menceritakan kisah Jay Gatsby, seorang pria kaya yang penuh misteri, dan obsesinya terhadap Daisy Buchanan, cinta lamanya. Melalui sudut pandang Nick Carraway, novel ini mengeksplorasi tema kesenjangan sosial, impian Amerika, dan kehampaan hidup kelas atas.",1925, scott);

        //Uji coba method copy
        bukuBaru.copy(bukuLama);
        bukuBaru.TampilkanDetailBuku();
        System.out.println();
        
        //Uji coba method hitung jumlah kata pada sinopsis
        System.out.println("Buku tersebut memiliki jumlah kata pada sinopsis sebanyak : " + bukuBaru.HitungJumlahKata() + " kata\n");

        //Uji coba cek kesamaan antar buku
        System.out.println("Buku " + bukuBaru.getNamaBuku() + " memiliki persaman dengan buku " + bukuLama.getNamaBuku() + " sebesar : " + bukuBaru.cekKesamaan(bukuLama)+ "%");
        System.out.println();
        

        //TUGAS KETIGA
        //Uji coba method hitung penjualan bulanan
        //Method setter untuk mengisi total penjualan pada bulan ini
        bukuBaru.setPenjualan(20);

        //Hasil output method hitungRoyalti dengan 1 parameter harga jual
        System.out.printf("Royalti yang didapat pada bulan ini adalah : Rp. %,.2f\n",bukuBaru.hitungRoyalti(150000) );

        System.out.println();
        
        //Hasil output method hitungRoyalti dengan 2 parameter yaitu harga jual dan persentase
        System.out.printf("Royalti yang didapat pada bulan ini adalah : Rp. %,.2f\n",bukuBaru.hitungRoyalti(150000,10));
        
        System.out.println();
        


        //Bahan belajar, hiraukan saja kak
        Buku bukuBaruLagi = new Buku();
        bukuBaruLagi.bacaFile("asd.txt");
        bukuBaruLagi.simpanFile("testing.txt");

        bukuBaruLagi.TampilkanDetailBuku();
    
        



            //HASIL TUGAS PERTAMA & TUGAS KEDUA

    //     //Kategori Teknologi
    //     //Objek Penulis Buku Teknologi
    //     Penulis walter = new Penulis("Walter Isaacson");
    //     Penulis robert = new Penulis("Robert C. Martin");
    //     Penulis gene = new Penulis("Gene Kim");
    //     Penulis kevin = new Penulis("Kevin Behr");
    //     Penulis george = new Penulis("George Spafford");
    //     Penulis melaine = new Penulis("Melanie Mitchell");
    //     Penulis nick = new Penulis("Nick Bostrom");
    //     Penulis brian = new Penulis("Brian Christian");
    //     Penulis tom = new Penulis("Tom Griffiths");

    //     //Objek Buku Teknologi
    //     Buku teknologi1 = new Buku("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution","Buku ini ditulis oleh Walter Isaacson dan diterbitkan pada tahun 2014. Buku ini mengisahkan sejarah ilmu komputer dan Revolusi Digital, menyoroti kontribusi para inovator yang membuat terobosan penting dalam teknologi komputer dan aplikasinya—mulai dari programmer komputer pertama, Ada Lovelace, hingga karya Alan Turing dalam kecerdasan buatan, hingga era Informasi saat ini.",2014, walter);
    //     Buku teknologi2 = new Buku("Clean Code: A Handbook of Agile Software Craftsmanship","Ditulis oleh Robert C. Martin dan diterbitkan pada tahun 2008, buku ini berfungsi sebagai panduan praktis untuk menulis kode yang bersih dan mudah dipelihara. Buku ini menekankan pentingnya praktik pengembangan perangkat lunak yang gesit dan memberikan wawasan tentang bagaimana menulis kode yang tidak hanya berfungsi tetapi juga elegan dan efisien.",2008, robert);
    //     Buku teknologi3 = new Buku("The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win","Ditulis oleh Gene Kim, Kevin Behr, dan George Spafford, buku ini diterbitkan pada tahun 2013. Melalui format novel, buku ini menceritakan transformasi departemen TI yang bermasalah menjadi unit yang efisien dan bernilai tinggi, menekankan prinsip-prinsip DevOps dan manajemen TI yang efektif.",2013,gene,kevin,george);
    //     Buku teknologi4 = new Buku("Artificial Intelligence: A Guide for Thinking Humans","Ditulis oleh Melanie Mitchell dan diterbitkan pada tahun 2019, buku ini memberikan tinjauan komprehensif tentang keadaan terkini kecerdasan buatan dan bagaimana teknologi ini membentuk kembali dunia kita. Mitchell menjelaskan konsep-konsep kompleks AI dengan cara yang dapat diakses oleh pembaca umum, serta membahas tantangan dan keterbatasan yang dihadapi dalam pengembangan AI.",2019,melaine);
    //     Buku Teknologi5 = new Buku("Superintelligence: Paths, Dangers, Strategies","Ditulis oleh Nick Bostrom dan diterbitkan pada tahun 2014, buku ini mengeksplorasi kemungkinan terciptanya superintelligence dan implikasinya bagi umat manusia. Bostrom membahas bagaimana superintelligence dapat diciptakan, karakteristik dan motivasinya, serta tantangan dalam mengendalikannya untuk memastikan bahwa tujuan-tujuannya sejalan dengan kepentingan manusia.",2014, nick);
    //     Buku Teknologi6 = new Buku("Algorithms to Live By: The Computer Science of Human Decisions","Ditulis oleh Brian Christian dan Tom Griffiths, buku ini diterbitkan pada tahun 2016. Buku ini mengeksplorasi bagaimana algoritma komputer dapat diterapkan untuk memecahkan masalah-masalah umum dalam kehidupan manusia, menawarkan wawasan tentang pengambilan keputusan, pengelolaan waktu, dan optimalisasi berbagai aspek kehidupan sehari-hari.",2016, brian,tom);

    //     //Objek Kategori
    //     Kategori teknologi = new Kategori("Teknologi", teknologi1,teknologi2,teknologi3,teknologi4,Teknologi5,Teknologi6);
    //     teknologi.TampilkanDaftarBuku();
    //     System.out.println();

    //     //Kategori Filsafat
    //     //Objek Penulis Buku Filsafat
    //     Penulis betrand = new Penulis("Bertrand Russell ");
    //     Penulis thomas = new Penulis("Thomas Nagel");
    //     Penulis martin = new Penulis("Martin Heidegger");
    //     Penulis rolf = new Penulis("Rolf Dobelli");
    //     Penulis yufal = new Penulis("Yuval Noah Harari");
    //     Penulis jean = new Penulis("Jean-Paul Sartre");

    //     //Objek Buku Filsafat
    //     Buku filsafat1 = new Buku("The Problems of Philosophy","Ditulis oleh Bertrand Russell dan diterbitkan pada tahun 1912, buku ini berusaha memberikan panduan singkat dan mudah diakses mengenai masalah-masalah utama dalam filsafat. Russell mengeksplorasi pertanyaan-pertanyaan seperti: Dapatkah kita membuktikan bahwa dunia eksternal itu ada? Dapatkah kita membuktikan sebab dan akibat? Dapatkah kita membenarkan generalisasi kita? Dapatkah kita secara objektif membenarkan moralitas? Ia menekankan bahwa nilai filsafat terletak pada ketidakpastiannya dan kemampuannya untuk memperluas pemikiran kita.",1912, betrand);
    //     Buku filsafat2 = new Buku("What Does It All Mean? A Very Short Introduction to Philosophy","Ditulis oleh Thomas Nagel dan diterbitkan pada tahun 1987, buku ini berfungsi sebagai pengantar singkat ke filsafat. Nagel mengajak pembaca untuk mempertimbangkan pertanyaan-pertanyaan mendasar tentang kehidupan, pikiran, pengetahuan, dan nilai, dengan tujuan memicu pemikiran kritis dan refleksi pribadi.",1987, thomas);
    //     Buku filsafat3 = new Buku("Being and Time","Salah satu karya filsafat paling berpengaruh abad ke-20, buku ini membahas konsep \"Dasein\" (keberadaan manusia) dan bagaimana manusia memahami eksistensi mereka dalam waktu. Heidegger mengkritik pendekatan metafisika tradisional dan berusaha memahami makna keberadaan melalui fenomenologi dan hermeneutika.", 1927, martin);
    //     Buku filsafat4 = new Buku("The Art of Thinking Clearly","Ditulis oleh Rolf Dobelli dan diterbitkan pada tahun 2011, buku ini mengungkap berbagai bias kognitif dan kesalahan berpikir yang sering kita lakukan dalam kehidupan sehari-hari. Dengan memahami dan mengenali kesalahan-kesalahan ini, pembaca diharapkan dapat membuat keputusan yang lebih baik dan berpikir lebih jernih.", 2011, rolf);
    //     Buku filsafat5 = new Buku("21 Lessons for the 21st Century","Ditulis oleh Yuval Noah Harari dan diterbitkan pada tahun 2018, buku ini membahas tantangan dan isu-isu utama yang dihadapi umat manusia di abad ke-21, termasuk teknologi, politik, perubahan iklim, dan spiritualitas. Harari mengajak pembaca untuk merenungkan bagaimana kita dapat menavigasi dunia yang terus berubah dengan cepat ini.",2018, yufal);
    //     Buku filsafat6 = new Buku("Being and Nothingness","Ditulis oleh Jean-Paul Sartre dan diterbitkan pada tahun 1943, buku ini adalah karya utama dalam filsafat eksistensialisme. Sartre mengeksplorasi konsep keberadaan, kesadaran, dan kebebasan, serta bagaimana individu menciptakan makna dalam dunia yang pada dasarnya tidak memiliki makna.",1943, jean);
        
    //     //Objek Kategori
    //     Kategori filsafat = new Kategori("Filsafat", filsafat1,filsafat2,filsafat3,filsafat4,filsafat5,filsafat6);
    //     filsafat.TampilkanDaftarBuku();
    //     System.out.println();

    //     //Kategori Sejarah
    //     //Objek Penulis Buku Sejarah
    //     Penulis jared = new Penulis("Jared Diamond");
    //     Penulis peter = new Penulis("Peter Frankopan");
    //     Penulis howard = new Penulis("Howard Zinn");
    //     Penulis will = new Penulis("Will Durant");
    //     Penulis ariel = new Penulis("Ariel Durant");

    //     //Objek Buku Sejarah
    //     Buku sejarah1 = new Buku("Sapiens: A Brief History of Humankind","Ditulis oleh Yuval Noah Harari dan diterbitkan pada tahun 2011, buku ini memberikan tinjauan komprehensif tentang sejarah umat manusia, mulai dari evolusi spesies Homo sapiens hingga perkembangan masyarakat modern. Harari mengeksplorasi bagaimana faktor-faktor seperti biologi, antropologi, dan sejarah telah membentuk peradaban manusia.",2011, yufal);
    //     Buku sejarah2 = new Buku("Guns, Germs, and Steel: The Fates of Human Societies","Ditulis oleh Jared Diamond dan diterbitkan pada tahun 1997, buku ini mengeksplorasi faktor-faktor geografis dan lingkungan yang mempengaruhi perkembangan peradaban manusia. Diamond berpendapat bahwa perbedaan dalam kekayaan dan kekuasaan antara masyarakat di seluruh dunia sebagian besar disebabkan oleh faktor-faktor seperti ketersediaan tanaman dan hewan yang dapat didomestikasi, serta penyebaran penyakit menular.",1997, jared);
    //     Buku sejarah3 = new Buku("The Silk Roads: A New History of the World","Ditulis oleh Peter Frankopan dan diterbitkan pada tahun 2015, buku ini menawarkan perspektif baru tentang sejarah dunia dengan menyoroti peran penting Jalur Sutra sebagai penghubung antara Timur dan Barat. Frankopan mengeksplorasi bagaimana rute perdagangan ini mempengaruhi pertukaran budaya, agama, dan ekonomi sepanjang sejarah.",2015, peter);
    //     Buku sejarah4 = new Buku("A People's History of the United States","Ditulis oleh Howard Zinn dan pertama kali diterbitkan pada tahun 1980, buku ini menyajikan sejarah Amerika Serikat dari perspektif kelompok-kelompok yang sering terpinggirkan dalam narasi sejarah tradisional, seperti pekerja, perempuan, dan minoritas. Zinn menyoroti perjuangan dan kontribusi mereka dalam membentuk bangsa.",1980, howard);
    //     Buku sejarah5 = new Buku("The Lessons of History","Ditulis oleh Will dan Ariel Durant dan diterbitkan pada tahun 1968, buku ini meringkas tema-tema utama dari sebelas volume \"The Story of Civilization\" yang mereka tulis bersama. Pasangan sejarawan ini merenungkan pola-pola sejarah yang berulang dan pelajaran yang dapat diambil dari peradaban masa lalu.",1968, will,ariel);

    //     //Objek Kategori
    //     Kategori sejarah = new Kategori("Sejarah",sejarah1,sejarah2,sejarah3,sejarah4,sejarah5);
    //     sejarah.TampilkanDaftarBuku();
    //     System.out.println();
        
    //     //Kategori Agama
    //     //Objek Penulis Buku Agama
    //     Penulis karen = new Penulis("Karen Armstrong");
    //     Penulis lewis = new Penulis("C.S. Lewis");
    //     Penulis richard = new Penulis("Richard Dawkins");
    //     Penulis crhistopher = new Penulis("Christopher Hitchens");

    //     //Objek Buku Agama
    //     Buku agama1 = new Buku("The Case for God","Ditulis oleh Karen Armstrong dan diterbitkan pada tahun 2009, buku ini mengeksplorasi sejarah agama dari zaman Paleolitik hingga masa kini, dengan fokus pada tiga agama Abrahamik: Yudaisme, Kristen, dan Islam. Armstrong menekankan teologi apofatik—pendekatan yang menekankan bahwa Tuhan melampaui pemahaman manusia—dan membedakan antara pengetahuan intelektual (logos) dan praktik keagamaan (mythos). Ia berpendapat bahwa realitas fundamental, yang kemudian disebut Tuhan, Brahman, nirvana, atau Tao, melampaui konsep dan pemikiran manusia, dan hanya dapat dikenal melalui praktik keagamaan yang penuh pengabdian.",2009, karen);
    //     Buku agama2 = new Buku("A History of God: The 4,000-Year Quest of Judaism, Christianity, and Islam","Ditulis oleh Karen Armstrong dan diterbitkan pada tahun 1993, buku ini menelusuri sejarah konsep Tuhan dalam tiga tradisi monoteistik utama: Yudaisme, Kristen, dan Islam. Armstrong menggali evolusi gagasan tentang Tuhan dari akar kunonya di Timur Tengah hingga masa kini, mengeksplorasi bagaimana persepsi dan pengalaman manusia tentang Tuhan telah berubah sepanjang waktu. Buku ini juga membahas pendekatan filosofis dan mistis terhadap konsep ketuhanan, serta bagaimana ide tentang Tuhan berkembang seiring dengan perubahan budaya dan sejarah.",1993, karen);
    //     Buku agama3 = new Buku("Mere Christianity","Ditulis oleh C.S. Lewis dan diterbitkan pada tahun 1952, buku ini merupakan kumpulan dari serangkaian siaran radio yang disampaikan Lewis selama Perang Dunia II. Buku ini menyajikan argumen untuk keyakinan Kristen, dimulai dengan konsep \"Hukum Moral\" yang universal dan bergerak menuju pembahasan doktrin-doktrin inti Kristen. Lewis berusaha menjelaskan dan membela keyakinan Kristen dengan cara yang logis dan dapat diakses oleh pembaca umum.",1952, lewis);
    //     Buku agama4 = new Buku("The God Delusion","Ditulis oleh Richard Dawkins dan diterbitkan pada tahun 2006, buku ini mengkritik keyakinan agama dan berargumen bahwa kepercayaan kepada Tuhan adalah delusi. Dawkins mengeksplorasi berbagai argumen untuk dan melawan keberadaan Tuhan, menantang validitas agama dalam masyarakat modern, dan mempromosikan pandangan dunia ateistik dan ilmiah.",2006, richard);
    //     Buku agama5 = new Buku("God Is Not Great: How Religion Poisons Everything","Ditulis oleh Christopher Hitchens dan diterbitkan pada tahun 2007, buku ini mengkritik agama sebagai kekuatan yang merusak dalam masyarakat. Hitchens berargumen bahwa agama menghambat kemajuan, mempromosikan intoleransi, dan merusak moralitas. Ia menggunakan contoh-contoh sejarah dan kontemporer untuk mendukung klaimnya bahwa agama memiliki dampak negatif pada individu dan masyarakat.",2007, crhistopher);
        
    //    //Objek Kategori
    //    Kategori agama = new Kategori("Agama",agama1,agama2,agama3,agama4,agama5);
    //    agama.TampilkanDaftarBuku();
    //    System.out.println();

    //     //Kategori Psikologi
    //     // Objek Penulis Buku Psikologi
    //     Penulis daniel = new Penulis("Daniel Kahneman");
    //     Penulis charles = new Penulis("Charles Duhigg");
    //     Penulis phillip = new Penulis("Philip Zimbardo");
    //     Penulis robertb = new Penulis("Robert B. Cialdini");
    //     Penulis dan = new Penulis("Dan Ariely");
    //     Penulis amir = new Penulis("Amir Levine");
    //     Penulis rachel = new Penulis("Rachel Heller");

    //     //Objek Buku Psikologi
    //     Buku psikologi1 = new Buku("Thinking, Fast and Slow","Daniel Kahneman mengeksplorasi dua sistem utama dalam cara berpikir manusia: Sistem 1 yang cepat, otomatis, dan emosional, serta Sistem 2 yang lebih lambat, penuh pertimbangan, dan logis. Kahneman menjelaskan bagaimana kedua sistem ini memengaruhi pengambilan keputusan kita, sering kali menyebabkan bias dan kesalahan, serta menawarkan wawasan tentang cara meningkatkan keputusan dengan memahami mekanisme berpikir kita.",2011, daniel);
    //     Buku psikologi2 = new Buku("The Power of Habit: Why We Do What We Do in Life and Business","Charles Duhigg membahas kekuatan kebiasaan dalam kehidupan sehari-hari dan dunia bisnis. Buku ini menjelaskan bagaimana kebiasaan terbentuk, bekerja, dan dapat diubah untuk mencapai kesuksesan. Dengan membahas berbagai studi kasus, Duhigg mengungkap bahwa memahami pola kebiasaan dapat membantu kita meningkatkan produktivitas dan mencapai perubahan positif dalam hidup.",2012, charles);
    //     Buku psikologi3 = new Buku("Predictably Irrational: The Hidden Forces That Shape Our Decisions","Dan Ariely mengeksplorasi bagaimana manusia sering kali bertindak tidak rasional dengan cara yang dapat diprediksi. Ariely menunjukkan bagaimana faktor-faktor seperti emosi, norma sosial, dan ekspektasi memengaruhi keputusan kita, serta bagaimana kita dapat membuat keputusan yang lebih baik dengan memahami bias kognitif yang kita miliki.",2008, dan);
    //     Buku psikologi4 = new Buku("The Lucifer Effect: Understanding How Good People Turn Evil","Philip Zimbardo meneliti bagaimana individu yang baik dapat melakukan tindakan jahat dalam kondisi tertentu. Berdasarkan Eksperimen Penjara Stanford, Zimbardo mengungkap faktor psikologis dan situasional yang dapat mendorong perilaku tidak bermoral. Buku ini juga membahas bagaimana memahami mekanisme ini dapat membantu mencegah perilaku buruk dan mempromosikan keberanian sipil.",2007, phillip);
    //     Buku psikologi5 = new Buku("Influence: The Psychology of Persuasion","Robert B. Cialdini mengungkap enam prinsip persuasi yang sering digunakan dalam pemasaran dan penjualan: resiprositas, komitmen dan konsistensi, bukti sosial, kewenangan, kesenangan, dan kelangkaan. Buku ini menjelaskan bagaimana prinsip-prinsip ini dapat dimanfaatkan secara etis maupun tidak etis dalam memengaruhi keputusan orang lain, serta bagaimana kita dapat mengenali dan melindungi diri dari manipulasi semacam itu.",1984, robertb);
    //     Buku psikologi6 = new Buku("Attached: The New Science of Adult Attachment and How It Can Help You Find—and Keep—Love","Amir Levine dan Rachel Heller mengeksplorasi teori keterikatan dalam hubungan dewasa. Buku ini mengidentifikasi tiga gaya keterikatan utama—aman, cemas, dan menghindar—serta membantu pembaca memahami pola keterikatan mereka sendiri dan pasangan mereka. Dengan wawasan ini, buku ini memberikan panduan untuk membangun hubungan yang lebih sehat dan memuaskan berdasarkan ilmu psikologi keterikatan.",2010, amir,rachel);

    //     //Objek Kategori
    //     Kategori Psikolgi = new Kategori("Psikologi", psikologi1,psikologi2,psikologi3,psikologi4,psikologi5,psikologi6);
    //     Psikolgi.TampilkanDaftarBuku();
    //     System.out.println();

    //     //Kategori Politik
    //     //Objek Penulis Kategori Politik
    //     Penulis niccolo = new Penulis("Niccolò Machiavelli");
    //     Penulis karl = new Penulis("Karl Marx");
    //     Penulis friedriche = new Penulis("Friedrich Engels");
    //     Penulis friedrichh = new Penulis("Friedrich Hayek");
    //     Penulis alexis = new Penulis("Alexis de Tocqueville");
    //     Penulis steven = new Penulis("Steven Levitsky");
    //     Penulis danielz = new Penulis("Daniel Ziblatt");

    //     //Objek Buku Politik
    //     Buku politik1 = new Buku("The Prince","Buku ini adalah karya politik yang menawarkan panduan praktis bagi para penguasa tentang cara memperoleh dan mempertahankan kekuasaan. Machiavelli menekankan bahwa tujuan politik dapat membenarkan cara-cara yang digunakan, termasuk tindakan yang tidak bermoral jika diperlukan untuk stabilitas dan keberlangsungan negara.",1532, niccolo);
    //     Buku politik2 = new Buku("The Communist Manifesto","Ditulis sebagai pamflet politik, buku ini menguraikan tujuan dan teori dasar komunisme. Marx dan Engels menganalisis perjuangan kelas dan ketegangan dalam masyarakat kapitalis, serta menyerukan kaum pekerja di seluruh dunia untuk bersatu dan menggulingkan sistem kapitalis demi terciptanya masyarakat tanpa kelas.",1848,karl,friedriche);
    //     Buku politik3 = new Buku("The Road to Serfdom","Hayek memperingatkan bahwa perencanaan ekonomi terpusat dan kontrol pemerintah yang berlebihan dapat mengarah pada totalitarianisme dan hilangnya kebebasan individu. Ia berpendapat bahwa intervensi negara dalam ekonomi dapat menyebabkan jalan menuju perbudakan, menekankan pentingnya pasar bebas dan kebebasan individu dalam menjaga masyarakat yang bebas dan makmur.",1944,friedrichh);
    //     Buku politik4 = new Buku("The Old Regime and the Revolution","Buku ini menganalisis penyebab dan sifat Revolusi Prancis, dengan fokus pada bagaimana struktur sosial dan politik sebelum revolusi (Ancien Régime) berkontribusi pada terjadinya perubahan revolusioner. De Tocqueville mengeksplorasi bagaimana reformasi yang tidak memadai dan ketidakpuasan publik terhadap institusi lama memicu revolusi, serta implikasinya bagi masyarakat modern.",1856,alexis);
    //     Buku politik5 = new Buku("How Democracies Die","Buku ini mengeksplorasi tanda-tanda dan proses kemunduran demokrasi di berbagai negara. Levitsky dan Ziblatt menganalisis bagaimana pemimpin terpilih dapat melemahkan institusi demokratis, menyingkirkan norma-norma politik, dan mengikis kebebasan sipil, yang akhirnya dapat menyebabkan runtuhnya demokrasi. Mereka juga menawarkan wawasan tentang bagaimana masyarakat dapat melindungi demokrasi dari ancaman internal.",2018, steven,danielz);
        
    //     //Objek Kategori
    //     Kategori Politik = new Kategori("Politik",politik1,politik2,politik3,politik4,politik5);
    //     Politik.TampilkanDaftarBuku();
    //     System.out.println();

    //     //Kategori Fiksi
    //     //Objek Penulis Buku Fiksi
    //     Penulis scott = new Penulis("F. Scott Fitzgerald");
    //     Penulis jane = new Penulis("Jane Austen");
    //     Penulis salinger = new Penulis("J.D. Salinger");
    //     Penulis gabriel = new Penulis("Gabriel García Márquez");
    //     Penulis tolkien = new Penulis("J.R.R. Tolkien");
    //     Penulis rowling = new Penulis("J.K. Rowling");

    //     //Objek Buku Fiksi
    //     Buku fiksi1 = new Buku( "The Great Gatsby","Berlatar di era Roaring Twenties di Amerika Serikat, novel ini menceritakan kisah Jay Gatsby, seorang pria kaya yang penuh misteri, dan obsesinya terhadap Daisy Buchanan, cinta lamanya. Melalui sudut pandang Nick Carraway, novel ini mengeksplorasi tema kesenjangan sosial, impian Amerika, dan kehampaan hidup kelas atas.",1925, scott);
    //     Buku fiksi2 = new Buku("Pride and Prejudice","Novel klasik ini mengisahkan Elizabeth Bennet, seorang wanita cerdas dan mandiri, yang harus menghadapi tekanan sosial dan prasangka dalam perjalanannya menemukan cinta. Konfliknya dengan Mr. Darcy, seorang pria kaya dan tampak sombong, berkembang menjadi kisah romantis yang menyentuh, dengan kritik tajam terhadap norma sosial pada masanya.",1813, jane);
    //     Buku fiksi3 = new Buku("The Catcher in the Rye","Buku ini mengikuti perjalanan Holden Caulfield, seorang remaja pemberontak yang melarikan diri dari sekolah asramanya dan berkelana di New York City. Dengan nada sinis dan reflektif, novel ini mengeksplorasi tema alienasi, pencarian identitas, dan kritik terhadap kepalsuan dunia orang dewasa.",1951, salinger);
    //     Buku fiksi4 = new Buku("One Hundred Years of Solitude","Novel ini mengisahkan perjalanan keluarga Buendía di kota fiksi Macondo, mencerminkan sejarah dan realitas Amerika Latin. Menggunakan gaya realisme magis, García Márquez menghadirkan cerita yang penuh keajaiban, tragedi, dan siklus kehidupan yang berulang, dengan tema takdir, kesepian, dan kekuasaan.",1967, gabriel);
    //     Buku fiksi5 = new Buku("The Lord of the Rings","Sebuah epik fantasi yang mengikuti perjalanan Frodo Baggins dan kelompoknya untuk menghancurkan Cincin Satu yang dapat memberikan kekuatan tak terbatas kepada penguasa jahat Sauron. Melalui petualangan yang penuh bahaya, pertempuran, dan persahabatan, novel ini mengeksplorasi tema keberanian, kejahatan, dan harapan.",1954, tolkien);
    //     Buku fiksi6 = new Buku("Harry Potter and the Sorcerer's Stone","Buku pertama dari seri Harry Potter ini memperkenalkan Harry Potter, seorang anak yatim piatu yang mengetahui bahwa ia adalah penyihir dan diterima di Sekolah Sihir Hogwarts. Bersama teman-temannya, ia menghadapi berbagai tantangan, termasuk melawan Lord Voldemort, penyihir jahat yang bertanggung jawab atas kematian orang tuanya.",1997, rowling);
        
    //     //Objek Kategori
    //     Kategori Fiksi = new Kategori("Fiksi",fiksi1,fiksi2,fiksi3,fiksi4,fiksi5,fiksi6);
    //     Fiksi.TampilkanDaftarBuku();


       
       
    }

        

}



