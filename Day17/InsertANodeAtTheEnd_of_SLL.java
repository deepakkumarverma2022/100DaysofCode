/*
You are given the pointer to the head node of a linked list and an integer to add to the list. 
Create a new node with the given integer. 
Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. 
The given head pointer may be null, meaning that the initial list is empty.
*/


#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();

typedef struct SinglyLinkedListNode SinglyLinkedListNode;
typedef struct SinglyLinkedList SinglyLinkedList;

struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
};

struct SinglyLinkedList {
    SinglyLinkedListNode* head;
};

SinglyLinkedListNode* create_singly_linked_list_node(int node_data) {
    SinglyLinkedListNode* node = malloc(sizeof(SinglyLinkedListNode));

    node->data = node_data;
    node->next = NULL;

    return node;
}

void print_singly_linked_list(SinglyLinkedListNode* node, char* sep, FILE* fptr) {
    while (node) {
        fprintf(fptr, "%d", node->data);

        node = node->next;

        if (node) {
            fprintf(fptr, "%s", sep);
        }
    }
}

void free_singly_linked_list(SinglyLinkedListNode* node) {
    while (node) {
        SinglyLinkedListNode* temp = node;
        node = node->next;

        free(temp);
    }
}

SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {
SinglyLinkedListNode *node, *temp;
node = (SinglyLinkedListNode *)malloc(sizeof(SinglyLinkedListNode));

node->data = data;
if(head == NULL) {
    head = node;
    return head;
}
 node->next = NULL;
 temp = head;
    while(temp->next != NULL) {
        temp = temp->next;
    }
 
    temp->next = node;
    return head;
    }

int main()
