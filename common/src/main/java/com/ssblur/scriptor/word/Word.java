package com.ssblur.scriptor.word;

public abstract class Word {
  public enum COSTTYPE {
    ADDITIVE,
    MULTIPLICATIVE
  }
  public record Cost(double cost, COSTTYPE type) {}
  /**
   * @return A number representing material cost or cast cooldown.
   * Actions shall cost at least 1.
   * Positive effects will generally cost more than negative ones.
   * Generally, for a Subject, the simplest / most accessible option should
   * cost 0, and more powerful or complex options should cost more.
   * Generally, for a Descriptor, anything that affects the spell should cost more than 0.
   * Purely aesthetic Descriptors should cost 0.
   * Some Descriptors may cost less than 0 if they introduce considerable downsides.
   * Whether these deduct from spell cost is up to the discretion of the developer of this
   * descriptor.
   */
  public abstract Cost cost();
}
