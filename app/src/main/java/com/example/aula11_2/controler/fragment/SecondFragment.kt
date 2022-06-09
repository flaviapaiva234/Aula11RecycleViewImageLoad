package com.example.aula11_2.controler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aula11_2.R
import com.example.aula11_2.controler.adapter.AdapterImagens
import com.example.aula11_2.databinding.FragmentSecondBinding
import kotlin.random.Random

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    //2. Fazer a criação da variável r
    private lateinit var adapterRecyclerView : AdapterImagens


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

     //7. depois de criar a função setAdapter, podemos chama-la
        startAdapter() //start pq é de inicializar

     //11.tem sempre que colocar o setDataAdapter depois do startAdaper para não dar chash
        setDataAdapter()
    }

    //1.Essa RecycleView precisa receber o adapter, que vai fazer a configuração da nossa adapter na recyclerView
    private fun startAdapter(){ //precisa chamar a recyclerView que foi feita a incerção lá no layout
//apply é para ter acesso a todos os métodos e variáveis da nossa recyclerView
        binding.recyclerViewExemple.apply {

     //3. Agora precisa fazer a instancia em si
            adapterRecyclerView = AdapterImagens() //agora a classe vai ser construida em si
     //4. Agora configurar o layoutManager da recyclerView
            //por padrão roda na vertical e os itens sobem, para fazer na horizontal teria que colocar #(context, LinearLayoutManeger.HORIZONTAL , false)* Esse false seria o reverse layout, se quiser no reverso é só deixar no true.
        //    * layoutManager = LinearLayoutManager(context) *  //vai declarar quantas linhas vai ter a nossa estrutura, vai especificar a forma como os dados vão ser especificados, pode ter uma fola unica de dados vertical, ou pode ter uma fila unica de dados horizontal, ou pode ter uma especie de tabela, varios itens com varias colunas
            layoutManager = GridLayoutManager(context, 2)


            //5. chamar o adapter da recyclerView, e inseriri o adapterRecyclerView que foi criado
            adapter = adapterRecyclerView //6.Apartir de agora, essa classe que foi criada *Adapterimagens* já está lincada com a nossa RecyclerView
        }
    }

    //8.Aqui vai inserir a listence
        private fun setDataAdapter(){
        //tem que passar a função de onde vai vir essa todas essas listas, geralmente essa informção vem do backend ou do banco de dados
        adapterRecyclerView.setData(myListUrls())    //está sendo utilizada a setData da classe Adapterimagens na linha 36
        // vai ter que criar essa lista logo abaixo
    }

    //9.não vaiter nenhum parametro, mas vai ter um retorno do tipo : List<Pair<String, String>> = ListOf (benefício do kotlin)
    private fun myListUrls(): List<Pair<String, String>> = listOf(
       Pair(
           " Contato ${rand(200, 999)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
           "https://picsum.photos/id/${rand(0, 100)}/200/300",
       ),
        Pair(
            " Contato ${rand(100, 900)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(100, 999)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(100, 999)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(97777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
        Pair(
            " Contato ${rand(200, 500)}, cel:(${rand(10, 99)})${rand(77777, 99999)}-${rand(7777, 9999)}" ,
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
        ),
    )

    //10. para criar o rand
    fun rand(from: Int, to: Int): Int {
        val random = java.util.Random()
        return random.nextInt(to - from) + from
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}