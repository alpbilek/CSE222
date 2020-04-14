public class main {
    static public void  main(String abs[]) {
        Dequer<Integer> d = new Dequer<>();
        Node<Integer> no = new Node<>();
        Node<Integer> no2 = new Node<>();
        Node<Integer> no3 = new Node<>();
        Node<Integer> no1 = new Node<>();
        Node<Integer> no4 = new Node<>();
        Node<Integer> no5 = new Node<>();
        Node<Integer> no6 = new Node<>();
        Node<Integer> no7 = new Node<>();
        Node<Integer> no8 = new Node<>();
        Node<Integer> no9 = new Node<>();
        Node<Integer> no10 = new Node<>();
        Node<Integer> no11= new Node<>();
        no.setData(5);
        no7.setData(879);
        no2.setData(8);
        no3.setData(9);
        no4.setData(17);
        no5.setData(5);
        no6.setData(78);
        no1.setData(6);
        no8.setData(15);
        no9.setData(16);
        no10.setData(25);
        no11.setData(19);
        d.addFirst(no);
        d.addLast(no1);
        d.addLast(no2);
        d.addLast(no3);
        System.out.println("The result of the add method is -> "+d.add(no4));
        d.push(no5);
        System.out.println("The result of the offerFirst method is -> "+d.offerFirst(no8));
        System.out.println("The result of the offerLast method is -> "+d.offerLast(no9));
        System.out.println("The result of the offer method is -> "+d.offer(no10));
        Node temp=(Node)d.peek();
        temp=(Node)d.peekLast();
        temp=(Node)d.peekFirst();
        temp=(Node)d.getFirst();
        temp=(Node)d.getLast();
        temp=(Node)d.element();
        d.printerHEAD();
        d.remove();
        d.removeFirst();
        d.removeLast();
        d.poll();
        d.pollFirst();
        d.pollLast();
        d.pop();
        d.printerHEAD();
        d.printerREMOVED();
        iterator b = d.Literator();
        b.set(no11);
        b.add(no6);
        d.printerHEAD();
    }

}
