/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes application output configuration in which you identify an
 * in-application stream and a destination where you want the in-application
 * stream data to be written. The destination can be an Amazon Kinesis stream or
 * an Amazon Kinesis Firehose delivery stream.
 * </p>
 * <p/>
 * <p>
 * You can configure your application to write output to up to five
 * destinations.
 * </p>
 */
public class Output implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the in-application stream.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the destination.
     * </p>
     */
    private KinesisStreamsOutput kinesisStreamsOutput;
    /**
     * <p>
     * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
     * </p>
     */
    private KinesisFirehoseOutput kinesisFirehoseOutput;

    private DestinationSchema destinationSchema;

    /**
     * <p>
     * Name of the in-application stream.
     * </p>
     * 
     * @param name
     *        Name of the in-application stream.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the in-application stream.
     * </p>
     * 
     * @return Name of the in-application stream.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the in-application stream.
     * </p>
     * 
     * @param name
     *        Name of the in-application stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Output withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the destination.
     * </p>
     * 
     * @param kinesisStreamsOutput
     *        Identifies an Amazon Kinesis stream as the destination.
     */

    public void setKinesisStreamsOutput(
            KinesisStreamsOutput kinesisStreamsOutput) {
        this.kinesisStreamsOutput = kinesisStreamsOutput;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the destination.
     * </p>
     * 
     * @return Identifies an Amazon Kinesis stream as the destination.
     */

    public KinesisStreamsOutput getKinesisStreamsOutput() {
        return this.kinesisStreamsOutput;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis stream as the destination.
     * </p>
     * 
     * @param kinesisStreamsOutput
     *        Identifies an Amazon Kinesis stream as the destination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Output withKinesisStreamsOutput(
            KinesisStreamsOutput kinesisStreamsOutput) {
        setKinesisStreamsOutput(kinesisStreamsOutput);
        return this;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
     * </p>
     * 
     * @param kinesisFirehoseOutput
     *        Identifies an Amazon Kinesis Firehose delivery stream as the
     *        destination.
     */

    public void setKinesisFirehoseOutput(
            KinesisFirehoseOutput kinesisFirehoseOutput) {
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
     * </p>
     * 
     * @return Identifies an Amazon Kinesis Firehose delivery stream as the
     *         destination.
     */

    public KinesisFirehoseOutput getKinesisFirehoseOutput() {
        return this.kinesisFirehoseOutput;
    }

    /**
     * <p>
     * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
     * </p>
     * 
     * @param kinesisFirehoseOutput
     *        Identifies an Amazon Kinesis Firehose delivery stream as the
     *        destination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Output withKinesisFirehoseOutput(
            KinesisFirehoseOutput kinesisFirehoseOutput) {
        setKinesisFirehoseOutput(kinesisFirehoseOutput);
        return this;
    }

    /**
     * @param destinationSchema
     */

    public void setDestinationSchema(DestinationSchema destinationSchema) {
        this.destinationSchema = destinationSchema;
    }

    /**
     * @return
     */

    public DestinationSchema getDestinationSchema() {
        return this.destinationSchema;
    }

    /**
     * @param destinationSchema
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Output withDestinationSchema(DestinationSchema destinationSchema) {
        setDestinationSchema(destinationSchema);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getKinesisStreamsOutput() != null)
            sb.append("KinesisStreamsOutput: " + getKinesisStreamsOutput()
                    + ",");
        if (getKinesisFirehoseOutput() != null)
            sb.append("KinesisFirehoseOutput: " + getKinesisFirehoseOutput()
                    + ",");
        if (getDestinationSchema() != null)
            sb.append("DestinationSchema: " + getDestinationSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKinesisStreamsOutput() == null
                ^ this.getKinesisStreamsOutput() == null)
            return false;
        if (other.getKinesisStreamsOutput() != null
                && other.getKinesisStreamsOutput().equals(
                        this.getKinesisStreamsOutput()) == false)
            return false;
        if (other.getKinesisFirehoseOutput() == null
                ^ this.getKinesisFirehoseOutput() == null)
            return false;
        if (other.getKinesisFirehoseOutput() != null
                && other.getKinesisFirehoseOutput().equals(
                        this.getKinesisFirehoseOutput()) == false)
            return false;
        if (other.getDestinationSchema() == null
                ^ this.getDestinationSchema() == null)
            return false;
        if (other.getDestinationSchema() != null
                && other.getDestinationSchema().equals(
                        this.getDestinationSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisStreamsOutput() == null) ? 0
                        : getKinesisStreamsOutput().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisFirehoseOutput() == null) ? 0
                        : getKinesisFirehoseOutput().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationSchema() == null) ? 0
                        : getDestinationSchema().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
