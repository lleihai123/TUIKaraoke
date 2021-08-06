//
//  TXKaraokeBaseDef.m
//  TRTCKaraokeOCDemo
//
//  Created by abyyxwang on 2020/6/30.
//  Copyright © 2020 tencent. All rights reserved.
//

#import "TXKaraokeBaseDef.h"

@implementation TXKaraokeRoomInfo

// 默认值与业务逻辑统一
- (instancetype)init {
    if (self = [super init]) {
        self.needRequest = YES;
    }
    return self;
}

@end

@implementation TXKaraokeUserInfo


@end

@implementation TXKaraokeSeatInfo

- (instancetype)init
{
    self = [super init];
    if (self) {
        self.status = 0;
        self.mute = NO;
        self.user = @"";
    }
    return self;
}

@end

@implementation TXKaraokeInviteData


@end
