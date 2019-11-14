/*
 * Item 1: Consider static factory methods instead of
 * constructors
 * The following are the advantages of using static factory
 * methods:
 * 1) Methods has names, the callers have better understanding what kind of instances are being created;
 * 2) Instances can be cached, doesnt' have to return a new instance with every call;
 * 3) Can create different sub type based on parameter values
 * 4) The class of the returned instance doe not need to exist when the class containing the method is
 * written, Service Provider Framework is one example of this
 */
package ca.weland.effectivejava.item1;