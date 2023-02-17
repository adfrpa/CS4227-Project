using System;
namespace StartingPoint {
public abstract class IPrice {
 abstract public PriceCodes PriceCode { get; }
 }
class ChildrensPrice : IPrice {
 public override PriceCodes PriceCode {
 get { return PriceCodes.Childrens; }
 }
 }
class NewReleasePrice : IPrice {
 public override PriceCodes PriceCode {
 get { return PriceCodes.NewRelease; }
 }
 }

class RegularPrice : IPrice {
 public override PriceCodes PriceCode {
 get { return PriceCodes.Regular; }
 }
 }
} 
