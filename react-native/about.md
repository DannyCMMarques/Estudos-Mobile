
# 🧱 React Native - Core Components e APIs

React Native fornece diversos **componentes nativos e APIs essenciais** para construir interfaces mobile para Android e iOS.

---

## 📦 1. Basic Components

| Componente     | Descrição                                                                 |
|----------------|---------------------------------------------------------------------------|
| `View`         | Container genérico, equivalente a `div` no HTML.                          |
| `Text`         | Exibe textos.                                                             |
| `Image`        | Exibe imagens locais ou via URL.                                          |
| `TextInput`    | Campo de entrada de texto com teclado.                                    |
| `ScrollView`   | Área com rolagem. Ideal para conteúdo pequeno que precisa rolar.          |
| `StyleSheet`   | Abstração de estilos parecida com CSS. Veja mais abaixo.                 |

---

## 🎨 2. User Interface Components

| Componente     | Descrição                                                                 |
|----------------|---------------------------------------------------------------------------|
| `Button`       | Botão simples com texto.                                                  |
| `Switch`       | Botão tipo liga/desliga (booleano). Ideal para configurações.             |

---

## 📋 3. List Views (Listagens)

| Componente     | Descrição                                                                 |
|----------------|---------------------------------------------------------------------------|
| `FlatList`     | Lista performática para grandes conjuntos de dados.                       |
| `SectionList`  | Lista com seções (ex: agrupamento por letras, categorias, etc).           |

---

## 🤖 4. Android-Specific Components

| Componente             | Descrição                                                                 |
|------------------------|---------------------------------------------------------------------------|
| `BackHandler`          | Detecta o botão físico "voltar".                                          |
| `DrawerLayoutAndroid`  | Drawer (menu lateral) exclusivo do Android.                              |
| `PermissionsAndroid`   | Solicita permissões em tempo de execução (ex: localização, câmera).       |
| `ToastAndroid`         | Exibe notificações do tipo "toast" nativas do Android.                    |

---

## 🍎 5. iOS-Specific Components

| Componente         | Descrição                                                                 |
|--------------------|---------------------------------------------------------------------------|
| `ActionSheetIOS`   | Exibe menus de ações (Action Sheets) nativos do iOS.                      |

---

## 🛠️ 6. Outros Componentes Úteis

| Componente             | Descrição                                                                 |
|------------------------|---------------------------------------------------------------------------|
| `ActivityIndicator`    | Ícone de carregamento circular.                                           |
| `Alert`                | Caixa de diálogo com botão "OK".                                          |
| `Animated`             | API para animações fluidas.                                               |
| `Dimensions`           | Obtém largura/altura da tela do dispositivo. Veja mais abaixo.           |
| `KeyboardAvoidingView` | Move os elementos para não serem cobertos pelo teclado.                   |
| `Linking`              | Abre links externos (URL, e-mail, etc).                                   |
| `Modal`                | Exibe uma camada modal sobre o conteúdo atual.                           |
| `PixelRatio`           | Acessa densidade de pixels da tela (útil para imagens responsivas).       |
| `RefreshControl`       | Componente de "pull to refresh" usado em ScrollView ou FlatList.         |
| `StatusBar`            | Controla o estilo e cor da status bar do dispositivo.                    |

---

## ✅ Boas Práticas

- Envolver a tela com `SafeAreaView` para respeitar os limites seguros do dispositivo (notch, barra de status, etc).
- Para melhor compatibilidade, use a lib `react-native-safe-area-context`.

---

## 📐 Dimensions

O módulo `Dimensions` do React Native permite obter as **dimensões da tela** do dispositivo (largura e altura).  
É útil para criar **layouts responsivos**, adaptando o tamanho dos componentes com base no tamanho da tela.

### Exemplo de uso:

```tsx
import { Dimensions } from 'react-native';

const { width, height } = Dimensions.get('window');
```

Você pode usar `width` e `height` para definir dinamicamente estilos:

```tsx
const dynamicStyles = {
  container: {
    width: Dimensions.get('window').width * 0.9,
  },
};
```

---

## 🎨 StyleSheet

O `StyleSheet` é a **forma oficial e recomendada** de aplicar estilos no React Native.  
Ele abstrai o uso de CSS usando objetos JavaScript e fornece otimizações de performance.

### Exemplo de uso:

```tsx
import { StyleSheet, View, Text } from 'react-native';

const styles = StyleSheet.create({
  container: {
    padding: 20,
    backgroundColor: '#f5f5f5',
  },
  title: {
    fontSize: 18,
    color: '#333',
  },
});
```

### Estilo Dinâmico junto com StyleSheet:

Você pode passar um array com os estilos estáticos e dinâmicos, assim:

```tsx
<View style={[styles.container, { width: width * 0.9 }]}>
  <Text style={styles.title}>Estilo Dinâmico + StyleSheet</Text>
</View>
```

---

## 📚 Dica

Explore a documentação oficial para cada componente:  
🔗 https://reactnative.dev/docs/components-and-apis


---

## 📸 `expo-camera`

A biblioteca `expo-camera` permite acessar a câmera do dispositivo para capturar fotos e vídeos.

### Exemplo básico:

```tsx
import { Camera } from 'expo-camera';

const [permission, requestPermission] = Camera.useCameraPermissions();
```

Você também pode exibir a visualização da câmera com `<Camera />`, configurar tipo (frontal/traseira), flash, etc.

---

## 🔗 `expo-linking`

`expo-linking` permite **navegar para links externos** ou **abrir o app por links (deep linking)**.

### Exemplo básico:

```tsx
import * as Linking from 'expo-linking';

Linking.openURL('https://expo.dev');
```

Também pode ser usado para abrir `mailto:`, `tel:`, `whatsapp://`, etc.

---

## 🧭 `expo-router`

O `expo-router` é um sistema de rotas **baseado em arquivos**, como o Next.js. Ele usa a pasta `app/` para definir as rotas automaticamente.

### Exemplo de estrutura de rotas:

```
app/
├── index.tsx         → "/"
├── login.tsx         → "/login"
└── produtos/
    └── [id].tsx      → "/produtos/:id"
```

### Exemplo de navegação programática:

```tsx
import { router } from 'expo-router';
router.push('/login');
```

### Exemplo de rota dinâmica:

```tsx
import { useLocalSearchParams } from 'expo-router';

const { id } = useLocalSearchParams(); // acessa o :id
```

---

## 📚 Dica

Explore a documentação oficial para cada componente:  
🔗 https://reactnative.dev/docs/components-and-apis  
🔗 https://expo.dev/router

## 🔥 Integração com Firebase Firestore

### 📦 Configuração Inicial

Antes de tudo, é necessário configurar o Firebase no seu projeto:

```ts
import { initializeApp } from "firebase/app";
import { getFirestore } from "firebase/firestore";

const firebaseConfig = {
  apiKey: "API_KEY",
  authDomain: "AUTH_DOMAIN",
  projectId: "PROJECT_ID",
  storageBucket: "STORAGE_BUCKET",
  messagingSenderId: "MESSAGING_SENDER_ID",
  appId: "APP_ID",
  measurementId: "MEASUREMENT_ID"
};

const app = initializeApp(firebaseConfig);
export const db = getFirestore(app);
```

Substitua os campos acima pelas informações do console do Firebase.

---

### ➕ Adicionar Documento

```tsx
import { collection, addDoc } from "firebase/firestore";
import { db } from "./firebase";

const addBook = async () => {
  const booksCollection = collection(db, "books");
  const bookData = { bookName, price, currency };
  await addDoc(booksCollection, bookData);
};
```

Firestore cria a coleção automaticamente se não existir.

---

### 📥 Buscar Todos os Documentos

```tsx
import { collection, getDocs } from "firebase/firestore";

const getCollection = async () => {
  const booksCollection = collection(db, "books");
  const data = await getDocs(booksCollection);
  setBooksData(data.docs); // exemplo usando React
};
```

---

### 🔍 Buscar Documento por ID e Atualizar

```tsx
import { collection, doc, getDoc, updateDoc } from "firebase/firestore";

const getDocById = async (id) => {
  const booksCollection = collection(db, "books");
  const singleBook = doc(booksCollection, id);
  const response = await getDoc(singleBook);
  setSelectedBook({ data: response.data(), id });
};

const setDocument = async (id) => {
  const booksCollection = collection(db, "books");
  const bookRef = doc(booksCollection, id);
  const updatedBook = { bookName, price, currency };
  await updateDoc(bookRef, updatedBook);
};
```

---

### ❌ Deletar Documento por ID

```tsx
import { collection, doc, deleteDoc } from "firebase/firestore";

const deleteDocument = async (id) => {
  const booksCollection = collection(db, "books");
  const docRef = doc(booksCollection, id);
  await deleteDoc(docRef);
};
```

---

### 🔎 Consultas com Filtros (Queries)

```tsx
import { query, where, getDocs, collection } from "firebase/firestore";

const getFilteredBooks = async () => {
  const booksCollection = collection(db, "books");
  const q = query(booksCollection, where("currency", "==", "USD"));
  const result = await getDocs(q);
  setFilteredBooks(result.docs.map(doc => doc.data()));
};
```

---

## 📚 Referência

- 🔗 https://firebase.google.com/docs/firestore
- 🔗 https://firebase.google.com/docs/web/setup

