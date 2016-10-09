#!/bin/bash
#
# Copyright 2016 ZTE Corporation.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

DIRNAME=`dirname $0`
HOME=`cd $DIRNAME/; pwd`
user=$1
password=$2
port=3306
host=127.0.0.1
echo "start init sdno_driver_zte_sptn db"
mysql -u$user -p$password -P$port -h$host <$HOME/dbscripts/mysql/openo-sdno-zte-sptn-driver-createobj.sql
sql_result=$?
if [ $sql_result != 0 ] ; then
   echo "failed to init sdno_driver_zte_sptn database!"
   exit 1
fi
echo "init sdno_driver_zte_sptn database success!"
exit 0

