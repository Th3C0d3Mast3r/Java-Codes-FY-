����   ? C
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  
EsselWorld
    Imagica
  	 
    out Ljava/io/PrintStream;  &Which Amusement Park are you going to?
    ! " # java/io/PrintStream println (Ljava/lang/String;)V
  % & ' nextLine ()Ljava/lang/String; ) essel world
 + , - . / java/lang/String equalsIgnoreCase (Ljava/lang/String;)Z
 + 1 2 3 charAt (I)C
  5 6  inputs
  5 9 Experiment7D Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable @ [Ljava/lang/String; 
SourceFile Experiment7D.java ! 8           :        *� �    ;       � 	 < =  :   �     U� Y� 	� L� Y� M� Y� N� � +� $:(� *�  � 0E� � 0e� 
,� 4� -� 7�    ;   & 	   �  �  �  � # � ) � I � P � T � >    � I  ?    +    A    B