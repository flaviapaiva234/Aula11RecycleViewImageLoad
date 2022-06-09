package com.example.aula11_2.controler.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.aula11_2.databinding.LayoutRecyclerViewBinding

//1.Fazer uma extenssão do Adaper que importa todos os métodos, para não ter que ficar criando tudo vez appós vez
//nessa classe já tem o facilitador que é o adapter, precisa passar mais uma classe que se chama ViewHolder
//ViewHouder é uma classe responsável por mostrar o layout em si, meio que cria a imagem, o adapter vai repassando as imformações que precisa
class AdapterImagens: RecyclerView.Adapter<AdapterImagens.ViewHolderImagens>() {

    //5.precisa de uma variaável que vai armazenar esses dados em si para a gente
    private var imageList : MutableList<Pair<String, String>> = arrayListOf()
    //a listas de imagem vai ser o tipo mutável

    //4.o parente contem o contesto geral, desse modo nãotem que passar o contexto via construtor
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderImagens {
        val itemBinding = LayoutRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        return  ViewHolderImagens(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolderImagens, position: Int) {
        holder.onBind(imageList[position])   //vai chamer a função onBind (3.)
        //o onBind precisa de um item da lista para popular
        //passado o imageList noso bindim foi invocado e está pegango a posição das imagens
    }

    //getItemCount tem que sobreescrever ele, pois varia de acordo com a forma que a RecyclerView está sendo implementar
    //função que vai chamar os dados na tela
    override fun getItemCount(): Int = imageList.size

        @SuppressLint("NotifyDataSetChanged")
        //precisa fazer um método para a incerção de valores
        fun setData(imageListAux : List<Pair<String, String>>){
            imageList.clear()  // tradução: todas as imagens da lista foram apagadas
            imageList.addAll(imageListAux)  //tradução: quero que novas imagens sejam inseridas
            notifyDataSetChanged()  //vai notificar o compilador que uma lista mutavel foi alterada

        }

//    fun addData(){
//
//    }



//2.vai extender de RecyclerView.ViewHolder, essa função tem que passar um construtor para o mesmo
    class ViewHolderImagens(val layout : LayoutRecyclerViewBinding) :
    RecyclerView.ViewHolder(layout.root){

    //3.essa função é responsável por todos os comportamentos da nossa imagem
    //nela vamos passar todas as informações que vão ser populadas naquele layout
    //todas as informações que forem necessária para a gente
       fun onBind(imageInfo: Pair<String, String>){  // esse Pair vai ser composto de duas strings, uma vais ser o nome da imagem e a outra vai ser a URL
           layout.tvTextImage.text = imageInfo.first //foi configurado para a parecer o texto na secondFragment
           layout.ivImage.load(imageInfo.second) // foi configurado também para popular imagem na secondFragment
       }

    }


}