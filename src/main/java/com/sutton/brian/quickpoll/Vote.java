package com.sutton.brian.quickpoll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    @Column(name="VOTE_ID")
    private Long id;

    @ManyToOne //Indicates that a vote instance can contain zero or more Option instances.
    @JoinColumn(name="OPTION_ID")
    private Option option;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
