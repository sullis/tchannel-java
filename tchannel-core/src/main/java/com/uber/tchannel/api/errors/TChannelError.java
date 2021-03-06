/*
 * Copyright (c) 2015 Uber Technologies, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.uber.tchannel.api.errors;

public class TChannelError extends Exception {
    public static final String ERROR_INTERRUPTED = "tchannel.interrupted";
    public static final String ERROR_WRAPPED = "tchannel.wrapped";

    public static final String ERROR_INIT_TIMEOUT = "tchannel.connection.timeout";
    public static final String ERROR_CONNECTION_RESET = "tchannel.connection.reset";
    public static final String ERROR_CONNECTION_FAILURE = "tchannel.socket";
    public static final String ERROR_NO_PEER_AVAILABLE = "tchannel.no-peer-available";

    public static final String ERROR_CODEC = "tchannel.codec";
    public static final String ERROR_PROTOCOL = "tchannel.protocol.error";

    public final String type;
    public final Throwable subError;

    public TChannelError(String message, String type, Throwable subError) {
        super(message);
        this.type = type;
        this.subError = subError;
    }

    public TChannelError(String message, String type) {
        super(message);
        this.type = type;
        this.subError = null;
    }
}
