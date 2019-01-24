/*
 * -\-\-
 * Spotify Styx Scheduler Service
 * --
 * Copyright (C) 2018 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.styx.model;

import org.junit.Assert;
import org.junit.Test;

public class ScheduleTest {

    @Test
    public void parseInputHOURS() {
        Assert.assertEquals(Schedule.parse("HOURS").expression(), "@hourly");
    }

    @Test
    public void parseInputDAYS() {
        Assert.assertEquals(Schedule.parse("DAYS").expression(), "@daily");
    }

    @Test
    public void parseInputWEEKS() {
        Assert.assertEquals(Schedule.parse("WEEKS").expression(), "@weekly");
    }

    @Test
    public void parseInputMONTHS() {
        Assert.assertEquals(Schedule.parse("MONTHS").expression(), "@monthly");
    }

    @Test
    public void parseInputYEARS() {
        Assert.assertEquals(Schedule.parse("YEARS").expression(), "@yearly");
    }

    @Test
    public void toJsonInputHOURS() {
        Assert.assertEquals(Schedule.parse("HOURS").toJson(), "hours");
    }

    @Test
    public void toJsonInputDAYS() {
        Assert.assertEquals(Schedule.parse("DAYS").toJson(), "days");
    }

    @Test
    public void toJsonInputWEEKS() {
        Assert.assertEquals(Schedule.parse("WEEKS").toJson(), "weeks");
    }

    @Test
    public void toJsonInputMONTHS() {
        Assert.assertEquals(Schedule.parse("MONTHS").toJson(), "months");
    }

    @Test
    public void toJsonInputYEARS() {
        Assert.assertEquals(Schedule.parse("YEARS").toJson(), "years");
    }

    @Test
    public void toStringInputHOURS() {
        Assert.assertEquals(Schedule.parse("HOURLY").toString(), "HOURS");
    }

    @Test
    public void toStringInputDAYS() {
        Assert.assertEquals(Schedule.parse("DAILY").toString(), "DAYS");
    }

    @Test
    public void toStringInputWEEKLY() {
        Assert.assertEquals(Schedule.parse("WEEKLY").toString(), "WEEKS");
    }

    @Test
    public void toStringInputMONTHLY() {
        Assert.assertEquals(Schedule.parse("MONTHLY").toString(), "MONTHS");
    }

    @Test
    public void toStringInputYEARS() {
        Assert.assertEquals(Schedule.parse("YEARLY").toString(), "YEARS");
    }

}
