class data{
    String value;
    int time;

    data(String value,int time){
        this.value = value;
        this.time = time;
    }
}

class TimeMap {

    Map<String , List<data>> map;
    public TimeMap() {
        map = new HashMap<String,List<data>>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k -> new ArrayList<data>()).add(new data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        return binarysearch(map.get(key), timestamp);

    }

    private String binarysearch(List<data> list,int time){
        int left =0; int right = list.size()-1;

        while(left<right){
           int mid = left + (right - left + 1) / 2;
           if (list.get(mid).time <= time) {
            left = mid; 
        } else {
            right = mid - 1; 
        }
        }
        return list.get(left).time <= time ? list.get(left).value : ""; 
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */