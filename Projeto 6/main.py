# -*- coding: cp1252 -*-

#Sonael de Albuquerque Angelos Neto

import asyncio


print("""
Esse programa tem como objetivo escrever em um arquivo de texto [Result.txt] o conteúdo dos arquivos [Char.txt, Number.txt]
de modo que o conteudo dos arquivos fiquem intercalando entre um e o outro. Para isso utlizei da biblioteca 'asyncio'
para a criação de corrotinas.

Exemplo de saida:

a
1
b
2
c
3
d
4
e
5
...

""")


#Abrindo os arquivos de texto
file1 = open("Char.txt",'r')
file2 = open("Number.txt",'r')
file3 = open("Result.txt","w")


#escrever() é uma função assíncrona que irá escrever dentro do arquivo result.txt
#A palavra chave 'await' é usada aqui para pausar a função e esperar que sua outra instancia possa escrever no arquivo
async def escrever(file):
    for line in file:
        file3.write(line)
        await asyncio.sleep(0.1)



#A função main() também é assíncrona,ela cria as intâncias da função escrever() e usa a palavra chave await para esperar que as duas intâncias terminem de executar
async def main():

    task1 = asyncio.create_task(escrever(file1))
    task2 = asyncio.create_task(escrever(file2))

    await task1
    await task2


#Executa a função main()
asyncio.run(main())
print("Fim do Programa")