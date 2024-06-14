# class song:
#     def __init__(self,value):
#         self.data=value
#         self.next=None
#         self.prev=None

# class playlist:
#     def __init__(self):
#         self.head=None
#         self.n=0
        
#     def insert_head(self,value):
#         new_song=song(value)
#         new_song.next=self.head
#         self.head=new_song

#     def show(self):
#         curr=self.head
#         p=1
#         while curr!=None:
#             print(f"{p}:{curr.data}")
#             curr=curr.next
#             p=p+1

#     def append(self,value):
#         new_song=song(value)
#         curr=self.head
#         while curr.next!=None:
#             curr=curr.next
#         print(curr.data)
#         curr.next=new_song

#     def delete_head(self):
#         if self.head.next==None:
#             self.head=None
        
#         elif self.head==None:
#             print("khali")
            
#         else:
#             self.head=self.head.next

#     def delete_last(self):
#         curr=self.head
#         if self.head.next==None:
#             self.head=None
#         while curr.next.next!=None:
#             curr=curr.next
#         curr.next=None

# sad_song=playlist()
# sad_song.insert_head("me preshan")
# # sad_song.insert_head("bewafa by imran khan")
# # sad_song.insert_head("kese huva")
# # sad_song.insert_head("kya huva")

# sad_song.head.data
# # sad_song.insert_head("bewafa by imran khan")
# # print(sad_song.head.data,sad_song.head.next.data)
# # sad_song.append("radhe radhe")
# # sad_song.show()
# # sad_song.append("Value")
# # sad_song.delete_head()
# # sad_song.show()
# # sad_song.delete_last()
# # sad_song.show()

# def remove(self,value):

#     if self.head == None:
#         return 'Empty LL'

#     if self.head.data == value:
#         return self.delete_head()

#     curr = self.head

#     while curr.next != None:
#         if curr.next.data == value:
#             break
#     curr = curr.next
#     if curr.next == None:
#         return 'Not Found'
#     else:
#         curr.next = curr.next.next

listo = [];
stt = "String";
for i in stt:
    listo.append(i)

print(listo)