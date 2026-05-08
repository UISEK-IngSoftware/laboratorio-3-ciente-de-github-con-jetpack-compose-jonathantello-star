package ec.edu.uisek.githubclient.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ec.edu.uisek.githubclient.ui.components.RepoItem

@Composable
fun RepoList () {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        RepoItem(
            name = "Proyecto de Django",
            description = "Un proyecto realizado en Django 5.2 para la materia de desarrollo Web",
            avatarImg = "https://assets.streamlinehq.com/image/private/w_300,h_300,ar_1/f_auto/v1/icons/3/django-icon-ozb2brnujb9dunjyx3d9xe.png/django-icon-p0v5p3t0ixxd5d03b6zt.png?_a=DATAiZAAZAA0",
            language = "Python"
        )
        RepoItem(
            name = "Proyecto de React",
            description = "Un proyecto realizado en React 18.2.2 para la materia de desarrollo Web",
            avatarImg = "https://cdn.iconscout.com/icon/free/png-256/free-react-icon-svg-download-png-282599.png?f=webp",
            language = "Typescript"
        )
        RepoItem(
            name = "Proyecto de Android",
            description = "Un proyecto realizado en Kotlin para la materia de desarrollo Móvil",
            avatarImg = "https://files.softicons.com/download/android-icons/flat-icons-add-on-1-by-martz90/png/512x512/android.png",
            language = "Kotlin"
        )
        RepoItem(
            name = "Proyecto de iOS",
            description = "Un proyecto realizado en Swift para la materia de desarrollo Móvil",
            avatarImg = "https://cdn-icons-png.freepik.com/256/25/25345.png?semt=ais_white_label",
            language = "Swift"
        )
    }
}