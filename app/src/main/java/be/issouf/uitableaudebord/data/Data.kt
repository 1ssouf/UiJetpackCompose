package be.issouf.uitableaudebord.data

import be.issouf.uitableaudebord.model.Content
import be.issouf.uitableaudebord.model.DataAnalytic
import be.issouf.uitableaudebord.model.DataRevenu

object Data {
    val analyticData = listOf(
        DataAnalytic("solde", "109,5e"),
        DataAnalytic("epargne", "0,0e")

    )

    val revenuData = listOf(
        DataRevenu("Juin", 1204f),
        DataRevenu("Mai", 950f),
        DataRevenu("Avril", 1145f),
        )

    val lastContent = listOf(
        Content(
            "25/29/2023",
            "j",
            -150
        ),
        Content(
            "25/29/2023",
            "il y a 3 jours",
            -250
        ),
        Content(
            "25/29/2023",
            "il y a 4 jours",
            -99
        ),
        Content(
            "25/29/2023",
            "il y a 4 jours",
            -25
        )
    )
}

