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

    //let isPresent = this.checkPresent(key);

    if(!this.data[address]) {

      this.data[address] = [] 

    } 
     if(!this.checkPresent(key)){
      this.data[address].push([key, value]) 
      // return this.data
    }

    return this.data

  }

  checkPresent(key) {

    let keys = this.keys();

    for(let i=0; i<keys.length; i++) {
      if(keys[i] === key) {
        return true;
      }
    }
    return false;

  }

  keys() {

    const keysArray = [];

    for(let i=0; i<this.data.length; i++) {
      
      if(this.data[i]) {
          for(let j=0; j<this.data[i].length;j++){
          keysArray.push(this.data[i][j][0])
        }
      }
    }

    //console.log(keysArray)
    return keysArray;

  }

  get(key) {

    let address = this._hash(key)
    const currentbucket = this.data[address]
    //console.log(currentbucket)
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
myHashTable.set("apples",1000)
myHashTable.set("apples",5000)
myHashTable.set("oranges",5000)
//myHashTable.get("grapes")
myHashTable.keys()
myHashTable.data;
