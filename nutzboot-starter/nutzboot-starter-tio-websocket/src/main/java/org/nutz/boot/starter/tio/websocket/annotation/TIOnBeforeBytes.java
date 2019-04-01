package org.nutz.boot.starter.tio.websocket.annotation;

import java.lang.annotation.*;

/**
 * example:
 *
 * import org.tio.core.ChannelContext;
 *
 * \@TIOnBeforeBytes
 * public TioWebsocketRequest onBeforeBytes(ChannelContext channelContext, byte[] bytes) {
 *     return TioWebsocketRequest.builder().event("ping").object("any").build
 * }
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface TIOnBeforeBytes {
}
