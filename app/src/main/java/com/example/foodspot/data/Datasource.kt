package com.example.foodspot.data

import com.example.foodspot.R
import com.example.foodspot.data.model.Category
import com.example.foodspot.data.model.Food

class Datasource {
    fun getFood(): List<Category> {
        return listOf(
            Category("American Grill",
            listOf(
                    Food(
                        "Baby back Ribs",
                        R.drawable.a1_jpeg,
                        4.5,
                        "Baby back ribs come from the parts of the ribs that are/" +
                                " connected to the backbone, beneath the loin muscle, and are /" +
                                "curved where the meet the spine. They're called “babies” because /" +
                                "they're shorter than spare ribs",
                        "Smoke that rib!"
                    ),
                    Food(
                    "The Original Emily Burger",
                        R.drawable.a2,
                    4.9,
                        "The \$26 burger features two patties, caramelized onions, /"+
                                  "American cheese, pickles, and the top-secret Emmy sauce — /" +
                                  "all inside of a pretzel bun.",
                        "Grill that patty and put that delicious Sauce on!"
                    ),
                    Food(
                        "Classic Mac & Cheese",
                        R.drawable.a3,
                        3.8,
                        "Macaroni and cheese (or Mac n cheese for North Americans) /"+
                                  "is largely known to be an American comfort food made of very/"+
                                  "soft macaroni pasta gently spread in a casserole dish and /"+
                                  "topped with an indulgent mornay sauce that gets slightly brown /"+
                                  "and crusty when baked.",
                        "Creamy cheesy Goodness!"
                    )
                )
            ),
            Category("Cocina Española",
            listOf(
                    Food(
                        "Pil Pil",
                        R.drawable.s1,
                        4.0,
                        "Gambas Pil Pil is a Spanish tapas dish or prawn starter recipe. /"+
                                   "Prawns cooked in olive oil, with paprika, garlic, and chilli.",
                        "With some Pan (Bread in spanish) very tasteful."
                    ),
                    Food(
                        "Paella",
                        R.drawable.s2,
                        4.5,
                        "In Spanish cuisine, a dish of saffron-flavoured rice cooked /"+
                                  "with meats, seafood, and vegetables.",
                        "The black Paella with Baby Squid, my favourite!"
                    ),
                    Food(
                        "Tostado con Tomate",
                        R.drawable.s3,
                        4.2,
                        "Pan con tomate, also known in Spain as /"+
                                   "pan tumaca or pa amb tomàquet in Catalan, is toasted bread/"+
                                   "topped with juicy tomatoes, extra virgin oil.",
                        "Crispy bread and fresh Tomatoes,delicious."
                    )
                )
            ),
            Category("Persian Cousine",
             listOf(
                    Food(
                        "Koobideh",
                        R.drawable.p1_jpg,
                        4.6,
                        "Kabob koobideh is a signature Persian grilled meat dish made/"+
                                  "with ground lamb/beef or a combination, grated onions and /"+
                                  "spices. From the streets of Iran to the finest of restaurants,/"+
                                  "these kebabs are immensely popular.",
                        "Grilled and best eaten fresh of the Grill!"
                    ),
                    Food(
                        "Ghorme Sabszi",
                        R.drawable.p2,
                        4.4,
                        "Ghormeh sabzi is a delicious Persian beef and kidney bean stew/"+
                                  "loaded with greens and fresh herbs like spinach, cilantro,/"+
                                  "fenugreek, and parsley.",
                        "Cook that stew and enjoy, tastes even better the next day:-)."
                    ),
                    Food(
                        "Sereshk Polo",
                        R.drawable.p3,
                        4.2,
                        "Zereshk polo morgh is one of the most famous dishes in /"+
                                  "Persian cuisine. It's full of wonderful flavors such as /"+
                                  "saffron, turmeric and barberry.",
                        "Comfort Food for persians."
                    ),
                    Food(
                        "Sabszi Polo boh Mahi",
                        R.drawable.p4,
                        4.1,
                        "Sabzi Polo Ba Mahi is a staple dish enjoyed during /"+
                                  "Persian New Year celebrations. With fresh herbs including /" +
                                  "dill, parsley, and cilantro and fragrant spices of turmeric /"+
                                  "and cinnamon, this recipe is packed full of flavour and simply/"+
                                  "delicious.",
                        "A get simply fluffy dill rice and fresh cooked fish."
                    )
                )
            )
        )
    }
}