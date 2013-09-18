package com.tngtech.configbuilder.annotations;

import com.tngtech.configbuilder.validators.value.ValueValidatorAbstract;

import java.lang.annotation.Annotation;

public @interface ValueValidator {
    Class<? extends ValueValidatorAbstract> value();
}
