class HashTable {

  constructor(size){

    this.data = new Array(size);

  }

  _hash(key) {

    let hash = 0;
    for(let i=0; i < key.length; i++) {

      hash = (hash + key.charCodeAt(i) * i) %
      this.data.length

    }

    return hash;

  }

  set(key, value) {

    let address = this._hash(key)

    if(!this.data[address]) {

      this.data[address] = [] 

    }

    this.data[address].push([key, value]) 

  }

  get(key) {

    let address = this._hash(key)
    const currentbucket = this.data[address]
    console.log(currentbucket)
    if(currentbucket) {

      for(let i = 0; i < currentbucket.length; i++) {

        if(currentbucket[i][0] === key){
          return currentbucket[i][1]
        }
      }
    }
    return undefined
  }

}

const myHashTable = new HashTable(2)
myHashTable.set("grapes",1000)
myHashTable.set("apples",5000)
myHashTable.get("grapes")
