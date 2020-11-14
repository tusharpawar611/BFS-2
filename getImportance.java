/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
       
        
        
        for(Employee emp: employees){
            map.put(emp.id,emp);
        }

        if(!map.containsKey(id))
            return 0;
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.offer(id);
        int sum=0;
        while(!q.isEmpty()){
            int temp = q.poll();
            Employee pres = map.get(temp);
            sum = sum+pres.importance;
          
            for(int i : pres.subordinates){
                  q.add(i);
            }
            
        }
        
        return sum;
        
    }
}