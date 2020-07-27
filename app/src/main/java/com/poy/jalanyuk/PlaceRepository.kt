package com.poy.jalanyuk

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import java.util.ArrayList

object PlaceRepository {

    val place: Place
        get() {

            val placeArrayList = Gson().fromJson<ArrayList<Place>>(json, object : TypeToken<ArrayList<Place>>() {

            }.type)

            return placeArrayList[0]
        }

    val placeList: ArrayList<Place>
        get() = Gson().fromJson(json, object : TypeToken<ArrayList<Place>>() {

        }.type)

    internal var json = "[\n" +
            "  {\n" +
            "    \"id\":\"TamanPantai\",\n" +
            "    \"name\":\"Taman Pantai\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Pantai\",\n" +
            "    \"image\":\"tamanpantai\",\n" +
            "    \"logo_image\":\"dir_shop_logo_1\",\n" +
            "    \"rating_count\":\"80\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"10\",\n" +
            "    \"total_like\":\"100\",\n" +
            "    \"total_comment\":\"5\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.283424\",\n" +
            "    \"lng\":\"103.860631\",\n" +
            "    \"opening\":\"06:00 - 18:00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/taman-pantai\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Ancol Taman Impian mempunyai pantai yang indah yang merupakan destinasi wisata pantai dalam kota Jakarta. Pengunjung kawasan Ancol dapat menikmati suasana segar di area Pantai Lagoon, Festival, Indah, Beach Pool dan Carnaval, serta Danau Impian, sepanjang kurang lebih 6,5 km. Wisata pantai ini semakin sempurna dengan adanya promenade hampir di sepanjang pantai serta fasilitas kuliner yang lengkap, antara lain: Jimbaran Resto, Le Bridge, Starbucks, Segarra, Talaga Sampireun dan lain-lain. Hal tersebut menjadikan wisata pantai Ancol ini lebih menarik untuk dikunjungi.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_zoo\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_orchard_garden\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Dufan\",\n" +
            "    \"name\":\"Dunia Fantasi ( DUFAN )\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Taman\",\n" +
            "    \"image\":\"dufan\",\n" +
            "    \"logo_image\":\"dir_shop_logo_2\",\n" +
            "    \"rating_count\":\"90\",\n" +
            "    \"total_rating\":\"3.5\",\n" +
            "    \"distance\":\"2.4 km\",\n" +
            "    \"discount\":\"0\",\n" +
            "    \"total_like\":\"80\",\n" +
            "    \"total_comment\":\"2\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.405314\",\n" +
            "    \"lng\":\"103.788753\",\n" +
            "    \"opening\":\"10:00 - 17:00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/dunia-fantasi\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Dunia Fantasi atau yang lebih populer dengan sebutan Dufan, pertama kali dibuka untuk umum pada 29 Agustus 1985 dan merupakan theme park pertama yang dikembangkan oleh Perseroan dan telah memiliki sertifikat ISO 9001:2015 sejak Februari 2017.Selain menjadi pusat hiburan outdoor, Dufan juga merupakan kawasan edutainment fisikia terbesar di Indonesia yang memanjakan pengunjung dengan Fantasi Keliling Dunia, melalui wahana permainan berteknologi tinggi, yang terbagi dalam 9 (Sembilan) kawasan yaitu Indonesia, Jakarta, Asia, Eropa, Amerika, Yunani, Hikayat, Kalila dan Fantasy Lights.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#512DA8\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_zoo\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"SeaWorldAncol\",\n" +
            "    \"name\":\"Sea World Ancol\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Gardens\",\n" +
            "    \"image\":\"seaworld\",\n" +
            "    \"logo_image\":\"dir_shop_logo_3\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"distance\":\"1.5 km\",\n" +
            "    \"discount\":\"50\",\n" +
            "    \"total_like\":\"70\",\n" +
            "    \"total_comment\":\"10\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.311866\",\n" +
            "    \"lng\":\"103.814687\",\n" +
            "    \"opening\":\" 09.00-18.00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/sea-world-ancol\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Sea World Ancol merupakan sebuah kawasan yang lengkap untuk memberikan hiburan dan pendidikan khususnya dunia laut. Dalam operasionalnya, Sea World Ancol mengemban 3 misi besar yaitu: Pendidikan, Konservasi dan Hiburan. Melalui misi ini Sea World Ancol menempatkan diri sebagai tempat hiburan berkualitas. Dalam usaha memperkenalkan kehidupan biota yang hidup di alam, SeaWorld Ancol memiliki sekitar 7.300 ekor biota air tawar yang terdiri dari 48 Jenis ikan, 1 jenis reptil sampai biota perairan laut yang terdiri dari 11.500 ekor biota yang terdiri dari 138 jenis ikan dan avertebrata serta 3 jenis reptil. Biota-biota tersebut ditampilkan dalam 28 display yang terbagi atas 9 akuarium perairan tawar dan 19 akuarium serta 4 kolam terbuka.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#1976D2\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_orchard_garden\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Atlantis\",\n" +
            "    \"name\":\"Atlantis\",\n" +
            "    \"type\":\"Kolam renang\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"image\":\"atlantis\",\n" +
            "    \"logo_image\":\"dir_shop_logo_4\",\n" +
            "    \"rating_count\":\"100\",\n" +
            "    \"total_rating\":\"5.0\",\n" +
            "    \"distance\":\"3.6 km\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"total_like\":\"150\",\n" +
            "    \"total_comment\":\"80\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.290656\",\n" +
            "    \"lng\":\"103.846270\",\n" +
            "    \"opening\":\"08.00 - 18.00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/atlantis-water-adventures\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Atlantis Water Adventures merupakan taman rekreasi air tematik dengan konsep peradaban dan kota-kota kuno di wilayah Mediterania yang lenyap akibat letusan gunung api dan gempa bumi. Atlantis Water Adventures yang dahulu bernama Gelanggang Renang Ancol resmi dibuka untuk umum pada tanggal 28 Juni 1974 diresmikan oleh Gubernur DKI Jakarta Bapak Let.Jend Marinir Ali Sadikin dengan luar areal menjadi 7 HA.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#1976D2\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_clarke_quay\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Ocean\",\n" +
            "    \"name\":\"Ocean Dream Samudra\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Landmarks\",\n" +
            "    \"image\":\"oceansamudra\",\n" +
            "    \"logo_image\":\"dir_shop_logo_5\",\n" +
            "    \"rating_count\":\"250\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"210\",\n" +
            "    \"total_comment\":\"50\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.252010\",\n" +
            "    \"lng\":\"103.829873\",\n" +
            "    \"opening\":\"09:00 - 18:00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/ocean-dream-samudra\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Ocean Dream Samudra ini diresmikan pada juni 1974 oleh Gubernur Ali Sadikin sebagai perwujudan cita-citanya tentang perlunya sarana rekreasi yang mengenalkan kepada masyarakat tentang laut beserta potensinya. Ocean Dream Samudra merupakan Edutainment Theme Park bernuansa konservasi alam yang memberikan pengalaman untuk mengenal lebih dekat dan menyayangi aneka satwa.Ocean Dream Samudra merupakan unit oceanarium terbesar yang terdiri dari pentas lumba-lumba, pentas singa laut, pentas aneka satwa, peragaan satwa, akuarium ikan laut dan tawar  serta taman yang merupakan habitat beraneka macam burung.Terobosan Ancol ini menjadi pusat studi konservasi ex-situ lumba-lumba (dolphinarium) karena memiliki konsep dan manajemen lumba-lumba yang paling lengkap, meliputi berbagai unsur yang saling mendukung seperti kolam penampungan lumba-lumba, water treatment, trainer/keeper, pengadaan ikan yang berkualitas, laboratorium, para medis dan dokter hewan. \",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_sentosa\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"PasarSeni\",\n" +
            "    \"name\":\"Pasar Seni\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Market\",\n" +
            "    \"image\":\"pasarseni\",\n" +
            "    \"logo_image\":\"dir_shop_logo_5\",\n" +
            "    \"rating_count\":\"250\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"210\",\n" +
            "    \"total_comment\":\"50\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.252010\",\n" +
            "    \"lng\":\"103.829873\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"-\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/pasar-seni\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Pasar Seni Ancol adalah pusat seni budaya yang menaungi kesenian multi-disiplin. Sejak didirikan tahun 1977, Pasar Seni Ancol telah menjadi platform kaya sejarah yang penting bagi perkembangan seni budaya di Jakarta dan Indonesia. Peletakan batu pertama dilaksanakan di Bulan Juli 1977 oleh Bapak Ali Sadikin, Gubernur DKI Jakarta, dan diresmikan oleh Gubernur H. Tjokropanolo pada tanggal 17 Desember 1977. Didirikan sebagai wujud nyata kepedulian Ancol bagi perkembangan seni budaya Indonesia dan kelangsungan kerja para seniman berbakat di Jakarta, Pasar Seni telah menjadi  platform berkumpul dan lahirnya ide-ide dari tokoh-tokoh seni budaya Indonesia.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_sentosa\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"AllianzEcopark \",\n" +
            "    \"name\":\"Allianz Ecopark \",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Landmarks\",\n" +
            "    \"image\":\"ecopark\",\n" +
            "    \"logo_image\":\"ecopark\",\n" +
            "    \"rating_count\":\"250\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"210\",\n" +
            "    \"total_comment\":\"50\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.252010\",\n" +
            "    \"lng\":\"103.829873\",\n" +
            "    \"opening\":\"06.00 - 18.00 WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/allianz-ecopark\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Allianz Ecopark memiliki luas lahan hampir 34 hektar merupakan kawasan hasil dari mengalihfungsikan Padang Golf Ancol menjadi sebuah sarana rekreasi terbaru yang menawarkan nilai-nilai edukasi (edutainment) dan petualangan (adventure) dengan pendekatan green lifestyle, menjadi ruang terbuka bagi pengunjung Ancol Taman Impian untuk mengeksplorasi pengetahuan botani dan rekreasi luar ruang.Allianz Ecopark terbagi menjadi beberapa kawasan (zona) dengan fungsi dan fasilitas berbeda. Selain Eco Care, Eco Nature, dan Eco Art, Allianz Ecopark juga akan menghadirkan zona Eco Energy. Pada keseluruhan zona ini, beragam jenis tanaman pesisir sesuai dengan kegunaannya bagi lingkungan hidup telah ditanam, sekaligus untuk menjadikan Ecopark sebagai sebuah kawasan yang hijau dan teduh, serta tempat pembelajaran botani lengkap yang menyenangkan. Menegaskan keberadaannya sebagai tempat rekreasi yang menawarkan unsur petualangan (adventure). \",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_sentosa\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"FaunaLand\",\n" +
            "    \"name\":\"Fauna Land\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Landmarks\",\n" +
            "    \"image\":\"faunaland\",\n" +
            "    \"logo_image\":\"dir_shop_logo_5\",\n" +
            "    \"rating_count\":\"250\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"210\",\n" +
            "    \"total_comment\":\"50\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.252010\",\n" +
            "    \"lng\":\"103.829873\",\n" +
            "    \"opening\":\"09:00 - 21:00, Open Now\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.faunaland.id\",\n" +
            "    \"phone\":\"08111707975 \",\n" +
            "    \"email\":\"farichaps@faunaland.id \",\n" +
            "    \"desc\":\"Faunaland adalah kebun binatang yang berlokasi di Ancol, Jakarta Utara dan berdiri diatas lahan seluas kurang lebih 5 hektar yang terdiri dari daratan dan perairan. Faunaland mengusung konsep Papua yang merupakan perpaduan antara benua Asia dan Australia sehingga menciptakan  keindahan flora,  fauna  dan seni budaya daerah tersebut. Konsep ini menghadirkan satwa-satwa unik dan langka dari berbagai wilayah di Indonesia khususnya wilayah timur Indonesia dan juga negara di dunia\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_sentosa\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Gondola\",\n" +
            "    \"name\":\"Gondola\",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Landmarks\",\n" +
            "    \"image\":\"gondola\",\n" +
            "    \"logo_image\":\"dir_shop_logo_5\",\n" +
            "    \"rating_count\":\"250\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"1.4 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"210\",\n" +
            "    \"total_comment\":\"50\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"lat\":\"1.252010\",\n" +
            "    \"lng\":\"103.829873\",\n" +
            "    \"opening\":\"11.00 - 18.00 WIB WIB\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"https://www.ancol.com/id/destination/gondola\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Gondola Ancol merupakan sarana rekreasi kereta gantung yang pertama di Indonesia yang menggunakan komputerisasi tekhnologi tinggi dengan system control dan keamanan tercanggih. Terletak di dalam area rekreasi Taman Impian Jaya Ancol. Petualangan terbang bersama Gondola akan memberikan pengalaman yang sangat mengesankan dan tak terlupakan, karena kita dapat menikmati keindahan teluk Jakarta dan sarana rekreasi lainnya di Ancol.Secara keseluruhan Gondola Ancol memiliki 37 unit kereta/cabin, yang dapat menampung 6 orang dewasa per cabin sehingga cukup luas dan nyaman sambil menikmati pemandangan di sekitar Ancol dari ketinggian +21 meter diatas permukaan laut, dengan jarak tempuh 2,4 km selama 20 menit.\",\n" +
            "    \"address\":\"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"marker_color\":\"#D50000\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_sentosa\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"EpicCablePark \",\n" +
            "    \"name\":\"Epic Cable Park \",\n" +
            "    \"city\":\"Jakarta\",\n" +
            "    \"type\":\"Parks\",\n" +
            "    \"image\":\"epicable\",\n" +
            "    \"logo_image\":\"dir_shop_logo_6\",\n" +
            "    \"rating_count\":\"150\",\n" +
            "    \"total_rating\":\"4.0\",\n" +
            "    \"distance\":\"0.3 km\",\n" +
            "    \"discount\":\"30\",\n" +
            "    \"total_like\":\"10\",\n" +
            "    \"total_comment\":\"1\",\n" +
            "    \"total_review\":\"80\",\n" +
            "    \"opening\":\"-\",\n" +
            "    \"booking_time\":\"Friday, 10th October, 7:30 PM\",\n" +
            "    \"website\":\"http://www.panacea-soft.com\",\n" +
            "    \"phone\":\"(+62-21) 29 222 222\",\n" +
            "    \"email\":\"customercare@ancol.com\",\n" +
            "    \"desc\":\"Epic Cable Park adalah tempat olahraga air Wakeboarding dengan penggunaan kabel (cable-wakeboard) pertama dan satu-satunya di Jakarta yang berskala internasional. Dengan didukung fasilitas olahraga air terbaik di dunia, EPIC Cable dapat memberikan sensasi luar biasa bagi setiap orang yang mencobanya.\",\n" +
            "    \"address\": \"Ecovention Building - Ecopark, Jalan Lodan Timur No 7 Ancol Taman Impian, Jakarta Utara\",\n" +
            "    \"lat\":\"1.319028\",\n" +
            "    \"lng\":\"103.706570\",\n" +
            "    \"marker_color\":\"#512DA8\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"sg_jurong_bird_park\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"sg_gardens_by_the_bay_singapore\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "]"
}
