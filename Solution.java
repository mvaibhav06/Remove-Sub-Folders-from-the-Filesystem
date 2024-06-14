class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder, (a,b) -> Integer.compare(a.length(),b.length()));
        List<String> out = new ArrayList<>();

        for(int i=0; i<folder.length; i++){
            
            String[] temp = folder[i].split("/");
            String s = "";
            int j = 0;
            for(j=0; j<temp.length; j++){
                if (temp[j].length()==0){
                    continue;
                }
                s += "/";
                s += temp[j];
                if(out.contains(s)){
                    break;
                }
            }
            if(j == temp.length){
                out.add(folder[i]);
            }
            
        }
        return out;
    }
}
